package string_functions;

public class Pgm052_Reverse_A_Given_String_In_A_Sentence_By_Method_With_Parameter {
	public static void main(String[] args) {
		reverse("ಸಿರಿಗನ್ನಡಂ ಗೆಲ್ಗೆ ಸಿರಿಗನ್ನಡಂ ಬಾಳ್ಗೆ");
	}

	static void reverse(String string) {
		String[] arr = string.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
