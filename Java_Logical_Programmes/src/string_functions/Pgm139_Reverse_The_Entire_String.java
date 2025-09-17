package string_functions;

public class Pgm139_Reverse_The_Entire_String {
	public static void main(String[] args) {
		String s = "Hi Hello How are You?";
		String[] arr = s.split(" ");
		String[] abb = new String[arr.length];
		int x = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			String s1 = arr[i];
			String rev = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				rev = rev + s1.charAt(j);
			}
			abb[x] = rev;
			x++;
		}
		for (String a : abb) {
			System.out.print(a + " ");
		}
	}
}
