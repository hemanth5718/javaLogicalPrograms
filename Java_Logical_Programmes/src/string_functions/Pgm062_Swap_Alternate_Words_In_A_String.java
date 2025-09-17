package string_functions;

public class Pgm062_Swap_Alternate_Words_In_A_String {
public static void main(String[] args) {
	String s = "Hello";
	char[] arr = s.toCharArray();
	for(int i =0; i<arr.length-1; i=i+2) {
		char temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1]= temp;
	}
	String s2= new String(arr);
	System.out.println(s2);
}
}
