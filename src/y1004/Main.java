package y1004;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total_num = in.nextInt();
		String noUse = in.nextLine();
		int minGrade = 101;
		int maxGrade = 0;
		
		String[] topStudent = new String[2];
		String[] lowStudent = new String[2];
		
		for (int loop = 0; loop < total_num; loop++) {
			String input = in.nextLine();
			String[] student = input.split(" ");
			int grade = Integer.parseInt(student[2]);
			if (grade < minGrade) {
				lowStudent[0] = student[0];
				lowStudent[1] = student[1];
				minGrade = grade;
			}
			if (grade > maxGrade) {
				topStudent[0] = student[0];
				topStudent[1] = student[1];
				maxGrade = grade;
			}
		}
		in.close();
		System.out.println(topStudent[0]+" "+topStudent[1]);
		System.out.println(lowStudent[0]+" "+lowStudent[1]);
	}
}
