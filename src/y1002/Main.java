package y1002;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String input = in.nextLine();
    	
    	int cnt = 0;
    	int temp = 0;
    	
    	for (int i = 0; i < input.length(); i++) {
    		temp = Integer.parseInt(input.substring(i,i+1));
    		cnt += temp;
    	}
    	
    	// System.out.println(cnt);
    	
    	String out = cnt + "";
    	
    	/*
    	 * 泛型必须左右都声明！
    	 */
    	HashMap<String, String> staff = new HashMap<String, String>();
    	
    	staff.put("1", "yi");
    	staff.put("2", "er");
    	staff.put("3", "san");
    	staff.put("4", "si");
    	staff.put("5", "wu");
    	staff.put("6", "liu");
    	staff.put("7", "qi");
    	staff.put("8", "ba");
    	staff.put("9", "jiu");
    	staff.put("0", "ling");
    	
    	for (int i = 0; i < out.length(); i++) {
    		String s = staff.get(out.substring(i,i+1));
    		System.out.print(s);
    		if (i < out.length()-1)
    			System.out.print(" ");
    	}
    }
}
