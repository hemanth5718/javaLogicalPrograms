package string_functions;

public class Pgm050_Reverse_A_Sentence_In_Given_String {
public static void main(String[] args) {
	String s = "This is a Simple Sentence";
	String rev ="";
	String[] arr = s.split(" ");
	for(int i=arr.length-1; i>=0; i--) {
		rev = rev+" "+arr[i];
	}
	System.out.println(rev.trim());

	
	String s1 = "This is a Simple Sentence";
	String[] arr1 = s1.split(" ");
	for(int i=arr1.length-1; i>=0; i--) {
		System.out.print(arr1[i]+ " ");
		}
}
}
