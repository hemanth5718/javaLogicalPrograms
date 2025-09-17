package array_Programmes;

public class Pgm112_Seperate_Cases_Numbers_Spl_Characters_From_A_Given_String {
	public static void main(String[] args) {
		String s = "AbccE23435%#%#%#";
		String uc = "";
		String lc = "";
		String no = "";
		String spl = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				uc = uc + ch;
			} else if (ch >= 97 && ch <= 122) {
				lc = lc + ch;
			} else if (ch >= 48 && ch <= 57) {
				no = no + ch;
			} else {
				spl = spl + ch;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(spl);
	}
}
