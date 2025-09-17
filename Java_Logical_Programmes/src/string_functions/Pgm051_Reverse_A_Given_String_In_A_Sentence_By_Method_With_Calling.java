package string_functions;

public class Pgm051_Reverse_A_Given_String_In_A_Sentence_By_Method_With_Calling {
public static void main(String[] args) {
	reverse();
}

 	static void reverse() {
 		String s = "ಈ ವಾಕ್ಯವನ್ನು ಬಲದಿಂದ ಎಡಕ್ಕೆ ಬದಲಾಯಿಸಿ";
 		String[] arr = s.split(" ");
 		for(int i = arr.length-1; i>=0; i--) {
 			System.out.print(arr[i]+ " ");
 		}
}
}
