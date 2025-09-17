package array_Programmes;

public class Pgm110_Merge_Two_Arrays_And_Remove_Duplicates {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int[] abb = { 50, 60, 70, 80, 90, 90, 100 };
		int size = arr.length + abb.length;
		int[] acc = new int[size];
		int index = 0;
		for (int i : arr) {
			acc[index] = i;
			index++;
		}
		for (int i : abb) {
			acc[index] = i;
			index++;
		}
		for (int i = 0; i < acc.length; i++) {
			for (int j = i + 1; j < acc.length; j++) {
				if (acc[i] == acc[j]) {
					acc[i] = 0;
				}
			}
		}
		for (int i : acc) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}
}
