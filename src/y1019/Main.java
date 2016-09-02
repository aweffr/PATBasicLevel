package y1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		char[] s = String.format("%04d", i).toCharArray();
		
		sort(s);
		
		if ( isAllEqual(s) ) {
			System.out.printf("%04d - %04d = 0000\n",toUpInt(s), toDnInt(s));
		}
		else {
			while (true) {
			    int bigI = toDnInt(s);
			    int smlI = toUpInt(s);
			    int diff = bigI - smlI;
			    System.out.printf("%04d - %04d = %04d\n", bigI, smlI, diff);
			    
			    if (diff == 6174) {
			    	break;
			    }
			    else {
			    	s = String.format("%04d", diff).toCharArray();
			    	if (isAllEqual(s)) {
			    		throw new Exception();
			    	}
			    	sort(s);
			    }
			}
		}		
	}
	
	public static boolean isAllEqual(char[] in) {
		boolean out = true;
		char first = in[0];
		for (int i=1; i<in.length; i++)
		{
			if (first != in[i])
			{
				out = false;
				break;
			}
		}
		return out;
	}
	
	public static void sort(char[] in) {
		
		for(int i=0; i<in.length; i++)
		{
			for (int j=i+1; j<in.length; j++)
			{
				if (in[i] > in[j])
				{
					swap(in, i, j);
				}
			}
		}
	}
	
	public static void swap(char[] in,int i,int j) {
		char temp = in[i];
		in[i] = in[j];
		in[j] = temp;
	}
	
	public static int toUpInt (char[] in) {
		int out = 0;
		for (int i = 0; i< in.length; i++)
		{
			out = out*10 + charToNumber(in[i]);
		}
		return out;
	}
	
	public static int toDnInt (char[] in) {
		int out = 0;
		for (int i = in.length-1; i >= 0; i--)
		{
			out = out*10 + charToNumber(in[i]);
		}
		return out;
	}
	
	public static int charToNumber(char in) {
		int out = (int) in - (int) '0';
		return out;
	}
}
