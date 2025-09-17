package print_with_loop_statement;

public class Pgm006_PrintOddNumbersFrom10_1 {
public static void main(String[] args) {
	for (int i = 10; i>=1; i--)
	{
		if (i%2==1)
		{
			System.out.println(i);
		}
	}
}
}
