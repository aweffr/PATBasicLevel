package y1006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inNum = in.nextInt();
		
		int[] digit = new int[3];
		
		digit[0] = inNum % 10;
		inNum /= 10;
		
		digit[1] = inNum % 10;
		inNum /= 10;
		
		digit[2] = inNum %10;
		inNum /= 10;
		
		if (digit[2] > 0)
		{
			for (int i=0; i< digit[2]; i++)
				System.out.print("B");
		}
		
		if (digit[1] > 0)
		{
			for(int i=0; i < digit[1]; i++)
				System.out.print("S");
		}
		
		for(int i=1;i<=digit[0];i++)
			System.out.print(i);
	}
}
