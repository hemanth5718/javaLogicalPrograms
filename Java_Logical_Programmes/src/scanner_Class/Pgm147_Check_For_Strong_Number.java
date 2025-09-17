package scanner_Class;

import java.util.Scanner;

public class Pgm147_Check_For_Strong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		int copy = no;
		int sum = 0;
		sc.close();
		while (no != 0) {
			int rem = no % 10;
			int fact = 1;
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			no = no / 10;
		}
		if (copy == sum) {
			System.out.println(copy + " is a Strong Number");
		} else {
			System.out.println(copy + " is not a Strong Number");
		}

	}
}
