package scanner_Class;

import java.util.Scanner;

public class Pgm130_Declare_And_Store_Values_In_Double_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		double[] arr = new double[size];
		System.out.println("Enter the values into Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		System.out.println("The items in the Array are:");
		for (double a : arr) {
			System.out.println(a);
		}
	}
}
