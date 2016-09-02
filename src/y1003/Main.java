package y1003;



import java.io.BufferedReader;

/*
 * 1. �ַ����б������P, A, T�������ַ��������԰��������ַ���
 * 2. �������� xPATx ���ַ��������Ի�á�����ȷ�������� x �����ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
 * 3. ��� aPbTc ����ȷ�ģ���ô aPbATca Ҳ����ȷ�ģ����� a, b, c �������ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����

 * ���ھ�����ΪPATдһ���Զ����г����ж���Щ�ַ����ǿ��Ի�á�����ȷ���ġ�
 * 
 * ����������һ�����ƹ�ʽ��
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
