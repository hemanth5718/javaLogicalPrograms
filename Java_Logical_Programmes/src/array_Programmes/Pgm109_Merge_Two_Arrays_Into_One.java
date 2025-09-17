package array_Programmes;

public class Pgm109_Merge_Two_Arrays_Into_One {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, };
		int[] abb = { 50, 60, 70, 80 };
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
		for (int i : acc) {
			System.out.println(i);
		}
	}
}
