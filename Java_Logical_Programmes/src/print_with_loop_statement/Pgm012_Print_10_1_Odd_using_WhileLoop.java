package print_with_loop_statement;

public class Pgm012_Print_10_1_Odd_using_WhileLoop {
public static void main(String[] args) {
	int i = 10;
	while (i>=1)
	{
		if (i%2==1)
		{
			System.out.println(i);
		}
		i--;
	}
}
}
