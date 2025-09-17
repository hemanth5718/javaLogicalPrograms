package scanner_Class;

import java.util.Scanner;

public class Pgm132_Remove_Duplicates_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values into the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The Array without duplicates is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 343;
				}
			}
		}
		for (int a : arr) {
			if (a != 343) {
				System.out.println(a);
			}
		}
	}
}
