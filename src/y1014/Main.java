package y1014;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		String s3 = in.nextLine();
		String s4 = in.nextLine();
		in.close();
		
		// 97
//		System.out.println((int) 'a');
		// 65
//		System.out.println((int) 'A');
		// 48
//		System.out.println((int) '0');
		// 57
//		System.out.println((int) '9');
		
		char[] week = findEuqalChar(s1, s2);
		String week_out = getWeek(week[0]);
		
		String hour_out = null;
		
		System.out.println(week[1]);
		
		if (week[1]>='0' && week[1] <='9')
		{
			hour_out = "0"+week[1];
		}
		else
		{
			hour_out = String.format("%d", (int)week[1]-55);
		}
		
		int minute = findEqualCharSmall(s3, s4);
		
		String minute_out = String.format("%02d", minute); 
		
		System.out.println(week_out+" "+hour_out+":"+minute_out);
	}
	
	public static char[] findEuqalChar(String s1, String s2) {
		char[] out = new char[2];
		int cnt = 0;
		for (int i=0; i<s1.length() && i<s2.length(); i++)
		{
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if (cnt == 0 && c1==c2 && c1<='Z' && c1>='A')
			{
				out[cnt] = c1;
				cnt += 1;
				continue;
			}
			
			if (cnt == 1 && c1==c2 && (c1<='Z' && c1>='A' || c1>='0' && c1 <='9') )
			{
				out[cnt] = c1;
				cnt += 1;
			}
			
			if (cnt==2)
				break;
		}
		return out;
	}
	
	public static int findEqualCharSmall(String s1, String s2) {
		int out = 0;
		for (int i=0; i<s1.length() && i<s2.length(); i++)
		{
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if (c1==c2 &&(   (c1>='a' && c1<='z') || (c1>='A' && c1<='Z')   ) )
			{
				out = i;
				break;
			}
		}
		return out;
	}
	
	public static String getWeek(char c) {
		HashMap<Character, String> weekData = new HashMap<Character, String>();
		weekData.put('A', "MON");
		weekData.put('B', "TUE");
		weekData.put('C', "WED");
		weekData.put('D', "THU");
		weekData.put('E', "FRI");
		weekData.put('F', "SAT");
		weekData.put('G', "SUN");
		return weekData.get(c);
	}
}
