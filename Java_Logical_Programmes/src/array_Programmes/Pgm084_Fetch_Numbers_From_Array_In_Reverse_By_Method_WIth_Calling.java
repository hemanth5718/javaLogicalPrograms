package array_Programmes;

public class Pgm084_Fetch_Numbers_From_Array_In_Reverse_By_Method_WIth_Calling {
public static void main(String[] args) {
	reverse();
}

 	static void reverse() {
 		int[]arr = {10,20,30,40,50,60,70,80,90,100};
 		for(int i =arr.length-1; i>=0; i--) {
 			System.out.println(arr[i]);
 		}
}
}
