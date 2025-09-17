package scanner_Class;

import java.util.Scanner;

public class Pgm127_Declare_And_Store_Values_In_Array_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Values for Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The Items in Array are:");
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
