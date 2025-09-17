package string_functions;

public class Pgm056_Convert_Character_Array_Into_String {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		String s = new String(arr);
		System.out.println(s);

		int[] irr = { 1, 2, 3, 4, 5, 6 };
		String s1 = "";
		for (int i = 0; i < irr.length; i++) {
			s1 = s1 + String.valueOf(irr[i]);
		}
		System.out.println(s1);

		String[] abb = { "hi", "hello", "how", "are", "you" };
		String s2 = "";
		for (int i = 0; i < abb.length; i++) {
			s2 = s2 + String.valueOf(abb[i] + " ");
		}
		System.out.println(s2.trim());
	}
}
