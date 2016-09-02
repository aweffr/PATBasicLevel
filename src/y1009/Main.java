package y1009;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		while (true)
		{
			String temp = in.next();
			input.add(temp);
			if (!in.hasNext())
				break;
		}
		
		for (int i=input.size()-1; i>=0; i--)
		{
			System.out.print(input.get(i));
			if (i>0) System.out.print(" ");
		}
		System.out.println();
	}
}
