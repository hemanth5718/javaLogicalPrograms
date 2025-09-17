package string_functions;

import java.util.ArrayList;

public class Pgm066_Fetch_The_PrimeNumbers_From_The_Given_Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,13,15,17,19};
		
			for (int i = 0; i < arr.length; i++) {
			int no = arr[i];
			int count = 0;
			
			for (int j = 1; j <=no; j++) {
				if (no%j==0) {
					count++;
				}
			}
			if (count ==2) {
				
				System.out.println(no+" -is a Prime Number");
			}
			
			else {
				
				System.out.println(no+" - is not a Prime Number");
			}
		}
	}
}

