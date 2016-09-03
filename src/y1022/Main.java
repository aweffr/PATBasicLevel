package y1022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Accepted!

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Reader.init(System.in);
		int in = Integer.parseInt(Reader.next()) + Integer.parseInt(Reader.next());
		int rad = Integer.parseInt(Reader.next());
		System.out.println(Integer.toString(in, rad));
	}
}

class Reader {
	static StringTokenizer tk;
	static BufferedReader br;
	
	public static void init(InputStream in) {
		br = new BufferedReader(new InputStreamReader(System.in));
		tk = new StringTokenizer("");
	}
	
	public static String next() throws IOException {
		while (!tk.hasMoreTokens()) {
			tk = new StringTokenizer(br.readLine());
		}
		return tk.nextToken();
	}
}
