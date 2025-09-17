package array_Programmes;

public class Pgm115_Fetch_Count_Of_Upper_Lower_Number_Special_Character_In_A_Given_String {
	public static void main(String[] args) {
		String s = "KJGHjdkh53y58397%#%#^#dkfjhdDHGHDJE%#%#22323";
		int uc = 0;
		int lc = 0;
		int no = 0;
		int spl = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				uc++;
			} else if (Character.isLowerCase(c)) {
				lc++;
			} else if (Character.isDigit(c)) {
				no++;
			} else {
				spl++;
			}
		}
		System.out.println("Total Count of Upper Case alphabets in the Given String is " + uc);
		System.out.println("Total Count of Lower Case alphabets in the Given String is " + lc);
		System.out.println("Total Count of Numbers in the Given String is " + no);
		System.out.println("Total Count of Special Characters in the Given String is " + spl);
	}
}
