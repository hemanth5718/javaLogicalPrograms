package patterns;

public class Pgm144_Inverted_Right_Angled_Triangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
