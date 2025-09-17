package scanner_Class;

import java.util.Scanner;

public class Pgm145_Prime_Numbers_Between_A_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number");
		int start = sc.nextInt();
		System.out.println("Enter the Ending Number");
		int last = sc.nextInt();
		sc.close();
		System.out.println("The Prime Numbers between " + start + " and " + last + " are:");
		for (int i = start; i <= last; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++)
				if (i % j == 0) {
					count++;
				}
			if (count == 2) {
				System.out.print(i + ",");
			}
		}
	}
}
