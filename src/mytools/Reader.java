package mytools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reader {
	static BufferedReader br;
	static StringTokenizer tk;
	
	public static void init(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		tk = new StringTokenizer("");
	}
	
	public static String next() throws IOException {
		while (!tk.hasMoreTokens()) {
			tk = new StringTokenizer(br.readLine());
		}
		return tk.nextToken();
	}
	
	public static int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(next());
	}
	
	public static double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(next());
	}
	

	public static void main(String[] args) throws IOException {
		Reader.init(System.in);
		for (int i=1; i<=10; i++) {
			System.out.println(i+" "+Reader.next());
		}
		
	}

}
