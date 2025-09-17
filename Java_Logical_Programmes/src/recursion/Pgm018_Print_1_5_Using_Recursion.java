package recursion;

public class Pgm018_Print_1_5_Using_Recursion {
	public static void main(String[] args) {
		disp(1);
	}

	public static void disp(int i) {
		if (i <= 5) {
			System.out.println(i);
			i++;
			disp(i);
		}
	}
}
