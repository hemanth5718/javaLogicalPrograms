package recursion;

public class Pgm23_Print_1_10_Odd_Numbers_Using_Recursion {
	public static void main(String[] args) {
		disp(1);
	}

	static void disp(int i) {
		if (i <= 10) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
			disp(i);
		}
	}
}
