package string_functions;

public class Pgm038_Convert_String_To_Character_Array {
public static void main(String[] args) {
	String ಅ = "ಅಆಇಈಉಊ";
	char[] ಇ = ಅ.toCharArray();
	for (int i = 0; i < ಇ.length; i++) {
		System.out.println(ಇ[i]);
	}
	System.out.println(ಇ);
	System.out.println(ಅ);
}
}
