package y1005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		ArrayList<Integer> numberLst = new ArrayList<Integer>();
		
		for (int i=0; i<N; i++) 
		{
			numberLst.add(in.nextInt());
		}
		in.close();
		
		boolean[] isDuplicated = new boolean[N];
		
		for (int i=0; i<N; i++) {
			int num_temp = numberLst.get(i);
			if (isDuplicated[i])
			{
				continue;
			}
			while (num_temp != 1) {
				if (num_temp%2 == 0)
				{
					num_temp /= 2;
				}
				else
				{
					num_temp = (3*num_temp + 1) / 2;
				}
				if (numberLst.contains(num_temp))
				{
					isDuplicated[numberLst.indexOf(num_temp)] = true;
				}
			}
		}
		
		ArrayList<Integer> outLst = new ArrayList<Integer>();
		for (int i=0; i<N; i++)
		{
			if (!isDuplicated[i])
			{
				outLst.add(-numberLst.get(i));
			}
		}
		Collections.sort(outLst);
		
		for (int i=0; i<outLst.size(); i++)
		{
			System.out.print(-outLst.get(i));
			if ( i<(outLst.size()-1) )
			{
				System.out.print(" ");
			}
		}
	}
	
	public static int compare(int x, int y)
	{
		if (x<y) return 1;
		else if(x==y) return 0;
		else return -1;
	}
}
