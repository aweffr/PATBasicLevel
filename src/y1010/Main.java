package y1010;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Xiang> input = new ArrayList<Xiang>();
		while(true)
		{
			int cof = in.nextInt();
			int exp = in.nextInt();
			Xiang tempXiang = new Xiang(cof, exp);
			input.add(tempXiang);
			
			if( !in.hasNext() )
				break;
		}
		
		qiuDao(input);
		
//		System.out.println(input);
		if (input.size() == 0)
		{
			System.out.print("0 0");
		}
		else
		{
			for (int i=0; i<input.size(); i++)
			{
				System.out.print(input.get(i));
				if (i < input.size()-1)
				{
					System.out.print(" ");
				}
			}
		}
	}
	
	public static void qiuDao(ArrayList<Xiang> input)
	{
		for(int i=0; i<input.size(); i++)
		{
			Xiang tempXiang = input.get(i);
			if (tempXiang.exp == 0)
			{
				input.set(i, null);
			}
			else
			{
				int newCof = tempXiang.cof * tempXiang.exp;
				int newExp = tempXiang.exp - 1;
				tempXiang = new Xiang(newCof, newExp);
				input.set(i, tempXiang);
			}
		}
		while (input.contains(null)) {
			input.remove(null);
		}
	}
}

class Xiang {
	int cof;
	int exp;
	public Xiang(int cof, int exp){
		this.cof = cof;
		this.exp = exp;
	}
	
	public String toString() {
		return cof+" "+exp;
	}
}