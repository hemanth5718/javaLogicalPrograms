package print_with_loop_statement;

public class Pgm011_Print_10_1_Even_using_WhileLoop {
public static void main(String[] args) {
	int i = 10;
	while (i>=1)
	{
		if (i%2==0)
		{
			System.out.println(i);
		}
		i--;
	}
}
}
