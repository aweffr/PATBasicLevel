package y1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String total = br.readLine();
		int N = Integer.parseInt(total);
		
		int[] jia = new int[3];
		int[] yi = new int[3];
		
		int[] jia_huoShen = new int[3];
		int[] yi_huoShen = new int[3];
		
		for (int i = 0; i < N; i++)
		{
			String[] input = br.readLine().split(" ");
			String s1 = input[0], s2 = input[1];
			jia[isWin(s1,s2)] ++;
			yi[isWin(s2, s1)] ++;
			
			if (isWin(s1, s2)==0) {
				jia_huoShen[mapChar(s1)] ++;
			}
			else if (isWin(s2, s1)==0) {
				yi_huoShen[mapChar(s2)] ++;
			}
		}
		System.out.println(jia[0]+" "+jia[1]+" "+jia[2]);
		System.out.println(yi[0]+ " "+yi[1] +" "+yi[2]);
		System.out.println(winMost(jia_huoShen)+" "+winMost(yi_huoShen));
		
	}
	
	public static int isWin(String s1, String s2) {
		// win -> 0; draw -> 1; lose -> 2;
		
		int out = 2;
		
		if (s1.equals("B") && s2.equals("C"))
		{
			out = 0;
		}
		else if (s1.equals("C") && s2.equals("J"))
		{
			out = 0;
		}
		else if (s1.equals("J") && s2.equals("B"))
		{
			out = 0;
		}
		else if (s1.equals(s2))
		{
			out = 1;
		}	
		
		return out;
	}
	
	public static int mapChar(String s) throws Exception {
		int out = 0;
		if (s.equals("B"))
		{
			out = 0;
		}
		else if (s.equals("C"))
		{
			out = 1;
		}
		else if (s.equals("J"))
		{
			out = 2;
		}
		else
		{
			throw new Exception();
		}
		return out;
	}
	
	public static char winMost(int[] in) {
		char out;
		if (in[0] >= in[1] && in[0] >= in[2])
		{
			out = 'B';
		}
		else if (in[1] > in[0] && in[1] >= in[2])
		{
			out = 'C';
		}
		else
		{
			out = 'J';
		}
		return out;
	}

}



// data structure
// 甲胜负情况 [win] -> [draw] -> [lose]
// 乙同上
// 甲获胜用的什么 [B] -> [C] -> [J]
