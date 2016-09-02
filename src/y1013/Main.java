package y1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		String in = br.readLine();
		String[] in_2 = in.split(" ");
		for(int i=0; i<in_2.length; i++)
		{
			System.out.println(Integer.parseInt(in_2[i]));
		}
		
//		int m = in.nextInt();
//		int n = in.nextInt();
//		in.close();
		
//		System.out.println(Integer.parseInt(str));
//		int MAX = 10001;
//		int[] primes = new int[MAX];
//		primes[0] = 2;
//		primes[1] = 3;
//		primes[2] = 5;
//		primes[3] = 7;
//		primes[4] = 11;
//		int cnt = 5;
//		MAIN_LOOP:
//		for(int i=13; cnt<MAX && cnt<n ;i+=2)
//		{
//			for(int j=0; j<cnt; j++)
//			{
//				if (i%primes[j]==0)
//				{
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt] = i;
//			cnt++;
//		}
//		
////		for(int i=4; i<27; i++)
////			System.out.print(primes[i]+" ");
//		
//		int zhengHang = (n - m) % 10;
//		
//		int cnt_loop = 1;
//		
//		for (int i=m-1; i<=n-1; i++)
//		{
//			if (i != n-1)
//			{
//				if(cnt_loop<10)
//				{
//					System.out.print(primes[i]+" ");
//					cnt_loop++;
//				}
//				else
//				{
//					System.out.print(primes[i]+"\n");
//					cnt_loop = 1;
//				}
//			}
//			else
//			{
//				System.out.print(primes[i]+"\n");
//			}
//		}
	}
}
