package y1012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
		int a0_out = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++)
		{
			int temp = in.nextInt();
			
			if (temp%5 == 0)
			{
				if (temp % 2 ==0)
				{
					a0_out += temp;
				}
			}
			else if (temp%5 == 1)
			{
				a1.add(temp);
			}
			else if (temp%5 == 2)
			{
				a2.add(temp);
			}
			else if (temp%5 == 3)
			{
				a3.add(temp);
			}
			else
			{
				a4.add(temp);
			}
		}
		in.close();
		
		int a1_out = 0;
		for(int i=0; i<a1.size(); i++)
		{
			if (i%2==0)
			{
				a1_out += a1.get(i);
			}
			else
			{
				a1_out -= a1.get(i);
			}
		}
		
		// a2
		int a2_out = a2.size();
		
		// a3
		double a3_out = 0.0;
		double sum = 0.0;
		for (int i=0; i<a3.size(); i++)
		{
			sum += a3.get(i);
		}
		if (a3.size() != 0)
		{
		    a3_out = sum / a3.size();
		}
		
		// a4
		int a4_out = 0;
		if (a4.size() > 0)
		{
			Collections.sort(a4);
			a4_out = a4.get(a4.size()-1);
		}
		
		//Print
		if (a0_out > 0)
		    System.out.print(a0_out+" ");
		else
			System.out.print("N ");
		
		if (a1.size() > 0)
			System.out.print(a1_out+" ");
		else
			System.out.print("N ");
		
		if (a2.size() > 0)
			System.out.print(a2_out+" ");
		else
			System.out.print("N ");
		
		if (a3.size() > 0)
			System.out.printf("%.1f ", a3_out);
		else
			System.out.print("N ");
		
		if (a4.size() > 0)
			System.out.print(a4_out);
		else
			System.out.print("N");
		
		System.out.println();
	}

}
