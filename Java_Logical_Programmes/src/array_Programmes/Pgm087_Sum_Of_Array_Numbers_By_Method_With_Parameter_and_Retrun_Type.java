package array_Programmes;

public class Pgm087_Sum_Of_Array_Numbers_By_Method_With_Parameter_and_Retrun_Type {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, };
		System.out.println(sum(arr));
	}

	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
