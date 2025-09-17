package print_with_loop_statement;

public class Pgm015_Print_1_5_Even_using_DoWhileLoop {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=5);
	}
}
