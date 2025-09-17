package scanner_Class;

import java.util.Scanner;

public class Pgm149_Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digits");
		long no = sc.nextLong();
		sc.close();
		long copy = no;
		int sum = 0;
		while (no != 0) {
			int rem = (int) no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		System.out.println("The sum of Digits of " + copy + " is " + sum);
	}
}
