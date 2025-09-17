package scanner_Class;

import java.util.Scanner;

public class Pgm148_Check_For_Armstrog_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		int copy = no;
		int sum = 0;
		sc.close();
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if (sum == copy) {
			System.out.println(copy + " is an Armstrong Number");
		} else {
			System.out.println(copy + " is not an Armstrong Number");
		}
	}
}
