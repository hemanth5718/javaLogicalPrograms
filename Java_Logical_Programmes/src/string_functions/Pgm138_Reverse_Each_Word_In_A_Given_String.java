package string_functions;

public class Pgm138_Reverse_Each_Word_In_A_Given_String {
	public static void main(String[] args) {
		String s = "Hi Hello How are You?";
		String[] arr = s.split(" ");
		String[]abb = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			String rev = "";
			for (int j = s1.length()-1; j >= 0; j--) {
				rev = rev + s1.charAt(j);
			}
			abb[i]=rev;
		}
		System.out.println("The Array after Reversing Each Word is:");
		for (String a : abb) {
			System.out.print(a + " ");
		}
	}
}
