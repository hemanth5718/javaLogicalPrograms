package print_with_loop_statement;

public class Pgm010_Print_1_5_Odd_using_WhileLoop {
public static void main(String[] args) {
	int i =1;
	while (i<=5)
	{
		if(i%2==1)
		{
			System.out.println(i);
		}
		i++;
	}
}
}
