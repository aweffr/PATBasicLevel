package y1003;



import java.io.BufferedReader;

/*
 * 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
 * 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 * 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。

 * 现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 * 
 * 条件三就是一个递推公式。
 */

/*
 * Accepted!
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int totalLines = in.nextInt();
    	String noUse = in.nextLine();
    	
    	for (int cnt = 0; cnt < totalLines; cnt++){
    		String test = in.nextLine();
//    		System.out.print(test+": ");
    		result(test);
    	}
    	in.close();
    }
    
    public static void result(String test) {
    	int i = test.indexOf("P");
		int j = test.indexOf("AT", i+1);
		int len = test.length();
		int a = i;
		int b = j - i;
		int c = len - (j+1) - 1;
		
		if (i < 0 || j < 0 || a * b != c) {
			System.out.println("NO");
			return;
		}
		
		String temp_a = test.substring(0,a);
		String temp_b = test.substring(a+1, j);
		String temp_c = test.substring(j+2);
		
		if (validation(temp_a) && validation(temp_b) && validation(temp_c)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
    
    public static boolean validation(String s) {
    	if (s.length() == 0)    return true;
    	else {
    		for (int i = 0; i < s.length(); i++) {
    			String sub = s.substring(i,i+1);
    			if (!sub.equals("A"))
    				return false;
    		}
    		return true;
    	}
    }
}
