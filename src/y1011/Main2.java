package y1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			long x=in.nextLong(), y=in.nextLong(), z=in.nextLong();
			long sum = x+y;
			if (sum <= z)
			{
				System.out.printf("Case #%d: false", i);
				System.out.println();
			}
			else {
				System.out.printf("Case #%d: true", i);
				System.out.println();
			}
		}
		in.close();
	}
}
