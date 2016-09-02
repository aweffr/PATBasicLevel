package y1010;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		while (true)
		{
			int temp = in.nextInt();
			input.add(temp);
			
			if (!in.hasNext())
				break;
		}
		
		for(int i=0; i<input.size(); i+=2)
		{
			int xiShu = input.get(i);
			int zhiShu = input.get(i+1);
			
			if (zhiShu != 0)
			{
				xiShu = xiShu * zhiShu;
				zhiShu -= 1;
			}
			else
			{
				xiShu = 0;
				zhiShu = 0;
			}
			
			input.set(i, xiShu);
			input.set(i+1, zhiShu);
		}
		
//		System.out.println(input);
		
		for (int i=0; i<input.size()-2; i+=2)
		{
			int xiShu = input.get(i);
			int zhiShu = input.get(i+1);
			
			if(xiShu!=0)
			{
				System.out.print(xiShu+" "+zhiShu);
			}
			else
			{
				continue;
			}
			
			System.out.print(" ");
		}
		int N = input.size();
		int xiShu_Last = input.get(N-2);
		int zhiShu_Last = input.get(N-1);
	}
}
