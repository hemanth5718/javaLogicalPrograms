package scanner_Class;

import java.util.Scanner;

public class Pgm122_Fetch_Array_From_Users {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The Array Items are:");
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
