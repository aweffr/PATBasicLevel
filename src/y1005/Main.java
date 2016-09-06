package y1005;

import java.util.*;
import java.io.*;

/**
 * Accepted! 09/26, 12:54pm
 * @author aweff
 *
 */

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException {
		Reader.init(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int N = Reader.nextInt();
		int[] data = new int[N];
		
		for(int i=0; i<N; i++) {
			int temp = Reader.nextInt();
			data[i] = temp;
			while(temp != 1) {
				temp = nextStep(temp);
				boolean successAdd = set.add(temp);
				if (!successAdd) break;
			}
		}
		
//		System.out.println(set);
		
		for(int i=0; i<N; i++) {
			if ( set.contains(data[i]) ) {
				// data[i] is not a independent number
				data[i] = -1;
			}
		} // After this for loop, all the independent number is set to -1.
		
		Arrays.sort(data);
//		System.out.println(Arrays.toString(data));
		
		for (int i=N-1; i>=0; i--) {
			int temp = data[i];
			if (temp != -1) {
				System.out.print(temp);
			}
			if (i>0 && data[i-1] != -1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	public static int nextStep(int in) {
		int out = 0;
		if (in % 2 == 0) {
			out = in/2;
		}
		else {
			out = (3*in + 1)/2;
		}
//		System.out.println("nextStep("+in+") called, out= "+out);
		return out;
	}
}

class Reader {
	static BufferedReader br;
	static StringTokenizer tk;
	
	public static void init(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		tk = new StringTokenizer("");
	}
	public static String next() throws IOException {
		while ( !tk.hasMoreTokens() ) {
			tk = new StringTokenizer(br.readLine());
		}
		return tk.nextToken();
	}
	public static int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(next());
	}
}