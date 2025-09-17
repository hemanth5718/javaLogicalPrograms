package array_Programmes;

public class Pgm089_Count_of_Odd_Numbers_In_An_Array {
public static void main(String[] args) {
	int[]arr = {1,2,3,4,5,6,7,8,9,10};
	int count =0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==1) {
			count++;
		}
	}
	System.out.println(count);
}
}
