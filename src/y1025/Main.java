package y1025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 本题算A了。除去一个大算例会运行超时。
 * @author aweffr
 *
 */

public class Main {
	static int endOfArray = -1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Rd.init(System.in);
		int firstAddr = Rd.nextInt();
		int totalN = Rd.nextInt();
		int reverseMod = Rd.nextInt();
		
		Node[] container = new Node[totalN];
		
		for(int i=0; i<totalN; i++) {
			container[i] = new Node(Rd.nextInt(), Rd.nextInt(), Rd.nextInt());
		}
		
		if (firstAddr == -1)
			return;
		
		addressSort(container, 0, firstAddr);
		
		if (endOfArray == -1)
			return;
		
		// 此处不能用totalN
		int cnt = endOfArray / reverseMod;
		
		// Reverse.
		for(int i=0; i<cnt; i++) {
			reverse(container, i*reverseMod, (i+1)*reverseMod);
		}
		
		for(int i=0; i<endOfArray-1; i++) {
			container[i].nextAddress = container[i+1].address;
		}
		container[endOfArray-1].nextAddress = -1;
		
		for (int i = 0; i < endOfArray; i++) {
			System.out.println(container[i]);
		}

	}
	
	public static void reverse(Node[] ar, int lo, int hi) {
		while (lo < hi - 1) {
			swap(ar, lo, hi-1);
			lo++;
			hi--;
		}
	}
	
	public static void addressSort(Node[] ar, int loc, int addr) {
		if (addr != -1 && loc < ar.length) {
			int indexofAddr = findNode(ar, loc, addr);
			if (indexofAddr == -1)
				return;
			swap(ar, loc, indexofAddr);
			int nextAddr = ar[loc].nextAddress;
			addressSort(ar, loc+1, nextAddr);
		}
		else {
			endOfArray = loc;
			return;
		}
	}
	
	public static void swap(Node[] ar, int i, int j) {
		Node temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public static int findNode(Node[] ar, int loc, int addr) {
		for (int i=loc; i < ar.length; i++) {
			if (ar[i].address == addr) {
				return i;
			}
		}
		return -1;
	}

}

class Node {
	int address;
	int data;
	int nextAddress;
	public Node(int a, int b, int c) {
		address = a;
		data = b;
		nextAddress = c;
	}
	
	public String toString() {
		String out = "";
		if (nextAddress != -1)
			out = String.format("%05d %d %05d", address, data, nextAddress);
		else
			out = String.format("%05d %d -1", address, data);
		return out;
	}
}

class Rd {
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
	
	public static int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(next());
	}
}
