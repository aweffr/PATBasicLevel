package y1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int MAX = in.nextInt();
		in.close();
		
		int[] primes = new int[500000];
	    primes[0] = 2;
	    primes[1] = 3;
		int cnt = 2;
		LOOP:
		for(int i=5; i <= MAX ;i+=2)
		{
			for (int j=0; j<cnt; j++)
			{
				if (i % primes[j] == 0)
				{
					continue LOOP;
				}
				else
				{
					//Do Nothing
				}
			}
			primes[cnt] = i;
			cnt++;
			
			if (cnt >= primes.length)
				break;
		}
		
		int cnt_out = 0;
		
		for (int i=0; i<(cnt-1); i++)
		{
			int diff = primes[i+1] - primes[i];
			if (diff == 2)
				cnt_out ++;
		}
		System.out.println(cnt_out);
	}
}
