package string_functions;

public class Pgm137_Seperate_Alphabets_Numbers_And_SpecialCharacters {
	public static void main(String[] args) {
		String s = "ci999#$@gmail.com";
		String alp = "";
		String no = "";
		String spl = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alp = alp + c;
			} else if (Character.isDigit(c)) {
				no = no + c;
			} else {
				spl = spl + c;
			}
		}
		System.out.println("After Seperation");
		System.out.println("The Alphabets are: " + alp);
		System.out.println("The Numbers are: " + no);
		System.out.println("The Special Characters are: " + spl);
	}
}
