package y1054;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		for (int i=0; i < N; i++) {
			try {
				String s = input[i];
				double num = Double.parseDouble(s);
				if (num > 1000 || num < -1000 || !validAur(num))
					throw new NumberFormatException();
				else
					numbers.add(num);
			}
			catch (NumberFormatException e) {
				System.out.printf("ERROR: %s is not a legal number",input[i]);
				System.out.println();
			}
		}
		
		double avg = average(numbers);
		
		N = numbers.size();
		
		if (N > 2)
			System.out.printf("The average of %d numbers is %.2f\n", numbers.size(), avg);
		else if (N == 0)
			System.out.println("The average of 0 numbers is Undefined");
		else
			System.out.printf("The average of %d number is %.2f\n", numbers.size(), avg);
	}
	
	public static boolean validAur(double in) {
		double aux = Double.parseDouble(String.format("%.2f",in));
		if (Math.abs(in - aux) < 1e-12)
			return true;
		else
			return false;
	}
	
	public static double average(ArrayList<Double> in) {
		double sum = 0.0;
		
		// Attention: arraylist µƒ  Ù–‘ « size()
		for (int i=0; i < in.size(); i++) {
			sum += in.get(i);
		}
		return sum / in.size();
	}

}
