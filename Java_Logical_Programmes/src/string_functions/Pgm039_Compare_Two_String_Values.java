package string_functions;

public class Pgm039_Compare_Two_String_Values {
	public static void main(String[] args) {
		String ಅ = "ಆಕಸ್ಮಿಕ";
		String ಇ = "ಆಕಸ್ಮಿಕ";
		System.out.println(ಅ.equals(ಇ));
		
		String ಉ = "ಆಕಸ್ಮಿಕ";
		String ಎ = "ಶಬ್ಧವೇಧಿ";
		System.out.println(ಉ.equals(ಎ));
		
		String s = "kaviratna kalidasa";
		String s1 ="KAVIRATNA KALIDASA";
		System.out.println(s.equalsIgnoreCase(s1));
	}
}
