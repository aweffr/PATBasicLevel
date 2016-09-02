package y1008;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		for(int i=0; i<N; i++)
		{
			input.add(in.nextInt());
		}
		in.close();
		
		if (M>=N)
		{
			M = M % N;
		}
		
		List<Integer> temp = input.subList(N-M, N);
		
		input.addAll(0,temp);
		
		for(int i=0; i<N; i++)
		{
			System.out.print(input.get(i));
			if (i<N-1)
			{
				System.out.print(" ");
			}
		}
	}	
}
