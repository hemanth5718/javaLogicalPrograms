package string_functions;

public class Pgm135_Print_Alphabets_For_Required_Number_Of_Time {
	public static void main(String[] args) {
		String s = "a3b2c5";
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				a = a + ch;
			} else {
				int no = Integer.parseInt(String.valueOf(ch));
				for (int j = 1; j <= no; j++) {
					System.out.print(a);
				}
				a = "";
				System.out.println();
			}
		}
	}
}
