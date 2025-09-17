package string_functions;

import java.util.Arrays;

public class Pgm057_Sort_Arrays {
	public static void main(String[] args) {
		char[] arr = { 'z', 'y', 'x', 'w', 't', 'p', 'e' };
		Arrays.sort(arr);
		for (char c : arr) {
			System.out.print(c+",");
		}
		System.out.println();
		
		String[] abb = { "Bhaktha Prahalada", "Srinivasa Kalyana", "Bedara Kanappa", "Sodari", "Bhaktha Vijaya" };
		Arrays.sort(abb);
		for (String string : abb) {
			System.out.print(string+",");
		}
		System.out.println();
		
		int[] irr = {9,8,7,6,5,3,4,2,1};
		Arrays.sort(irr);
		for (int i : irr) {
			System.out.print(i+",");
		}
	}
}
