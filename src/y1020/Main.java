package y1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
		// 月饼种类数量
		int N = Integer.parseInt(firstLine[0]);
		// 市场需求
		int max = Integer.parseInt(firstLine[1]);
		
		// 每种月饼的库存量
		int[] kuCun = parseStringArray(br.readLine().split(" "));
		
		// 每种月饼的总售价
		int[] zongJia = parseStringArray(br.readLine().split(" "));
		
		ArrayList<moonCake> cakeList = new ArrayList<moonCake>();
		for (int i=0; i<N; i++) {
			cakeList.add(new moonCake(kuCun[i], zongJia[i]));
		}
		Collections.sort(cakeList);
		
		double balance = 0;
		for (int i = N-1; i>=0; i--) {
			moonCake bestCake = cakeList.get(i);
			
			if (bestCake.kuCun <= max) {
				balance += bestCake.zongJia;
				max -= bestCake.kuCun;
			}
			else if (bestCake.kuCun > max) {
				balance += bestCake.danJia * max;
				max = 0;
			}
		}
		System.out.printf("%.2f", balance);
	}
	
	public static int[] parseStringArray(String[] in) {
		int[] out = new int[in.length];
		for (int i = 0; i < in.length; i++) {
			out[i] = Integer.parseInt(in[i]);
		}
		return out;
	}

}

class moonCake implements Comparable<moonCake> {
	int kuCun;
	int zongJia;
	double danJia;
	
	public moonCake(int kuCun, int zongJia) {
		this.kuCun = kuCun;
		this.zongJia = zongJia;
		this.danJia = (zongJia + 0.0) / kuCun;
	}
	
	public int compareTo (moonCake other) {
		if (this.danJia > other.danJia)
			return 1;
		else if (this.danJia == other.danJia)
			return 0;
		else 
			return -1;
	}
}
