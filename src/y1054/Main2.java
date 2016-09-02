package y1054;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Double> input = new ArrayList<Double>();
		for(int i=0; i<N; i++)
		{
			String s = in.next();
			try
			{
				double num = Double.parseDouble(s);
				// 7.123 -> 7.12
				// 这种处理方式值三分
				double temp = Double.parseDouble(String.format("%.2f", num));
				// 这个ABS值两分
				if (Math.abs(num - temp) > 1e-10)
				{
					throw new NumberFormatException();
				}
				if (num>=-1000 && num <= 1000)
				{
					input.add(num);
				}
				else
				{
					printErr(s);
				}
			}
			catch(NumberFormatException exception)
			{
				printErr(s);
			}
		}
		
		int cnt = input.size();
		double sum = 0.0;
		for(int i=0; i<cnt; i++)
		{
			sum += input.get(i); 
		}
		double avg = sum / cnt;
		if (cnt>1)
			System.out.printf("The average of %d numbers is %.2f\n", cnt, avg);
		else if (cnt==1)
			System.out.printf("The average of %d number is %.2f\n", cnt, avg);
		else
			System.out.printf("The average of 0 numbers is Undefined\n");
	}
	
	public static void printErr(String s) {
		System.out.println("ERROR: "+s+" is not a legal number");
	}
}
