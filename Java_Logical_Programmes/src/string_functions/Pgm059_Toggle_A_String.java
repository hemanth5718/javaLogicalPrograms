package string_functions;

public class Pgm059_Toggle_A_String {
	public static void main(String[] args) {
		String s = "HuliYa HaLINa MEvu";
		String tog = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				tog = tog + (char) (ch + 32);
			} else if (ch == ' ') {
				tog = tog + ch;
			} else if (ch >= 'a' && ch <= 'z') {
				tog = tog + (char) (ch - 32);
			}

		}
		System.out.println(tog);
	}
}
