package scanner_Class;

import java.util.Scanner;

public class Pgm150_Sum_Of_Even_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digits");
		long no = sc.nextLong();
		sc.close();
		long copy = no;
		int sum = 0;
		while (no != 0) {
			int rem = (int) no % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			no = no / 10;
		}
		System.out.println("The sum of even digits in " + copy + " is " + sum);
	}
}
