package string_functions;

public class Pgm044_Reverse_A_String_By_Method_With_Parameter {
public static void main(String[] args) {
	reverse("Janma Rahasya");
}

	static void reverse(String s) {
		String rev ="";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
}
}
