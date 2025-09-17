package array_Programmes;

public class Pgm111_Converet_String_To_Integer {
	public static void main(String[] args) {
		String book = "RS150";
		String bag = "RS200";
		String a = book.substring(2);
		String b = bag.substring(2);
		int s = Integer.parseInt(a);
		int p = Integer.parseInt(b);
		int c = s + p;
		if (c == 350) {
			System.out.println(true);
		}
	}
}
