package array_Programmes;

public class Pgm123_Print_Array_In_Reverse_Order {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int start = 0;
		int last = arr.length - 1;
		while (start <= last) {
			int temp = arr[start];
			arr[start] = arr[last];
			arr[last] = temp;
			start++;
			last--;
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
