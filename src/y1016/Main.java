package y1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int num1 = count(in[0], in[1]);
		int num2 = count(in[2], in[3]);
		int out = gouZao(Integer.parseInt(in[1]), num1) + 
				gouZao(Integer.parseInt(in[3]), num2);
		System.out.println(out);
		
		
//		String s = "232";
//		String s2 = "2";
		
//		System.out.println(count(s,s2));
		
//		System.out.println(gouZao(5,3));
	}
	
	public static int count(String s1, String s2) {
		int cnt = 0;
		
		for (int i=0; i< s1.length(); i++) {
			if (s1.substring(i,i+1).equals(s2))
			{
				cnt ++;
			}
		}
		return cnt;
	}
	
	public static int gouZao(int in, int cnt) {
		int out = 0;
		for (int i=0; i<cnt; i++)
		{
			out = 10 * out + in;
		}
		return out;
	}
}
