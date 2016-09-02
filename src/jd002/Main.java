package jd002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 1;
		double sum = 0;
		while (i>0.000001)
		{
			sum += i;
			i /= 2;
		}
		System.out.print(sum);
	}

}
