package array_Programmes;

public class Pgm085_Fetch_Numbers_From_Array_In_Reverse_By_Method_With_Parameter {
public static void main(String[] args) {
	int[]arr = {10,20,30,40,50,60,70,80,90,100};
	reverse(arr);
}

private static void reverse(int[] abb) {
	for(int i=abb.length-1; i>=0; i--) {
		System.out.println(abb[i]);
	}
}
}
