import java.util.Scanner;

public class fibonacci {
	public static int fibonacci(int value) {
		if (value <= 1) {
			return value;
		} else 
		{
			return fibonacci(value - 1) + fibonacci(value - 2);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Value : ");
		int inp = input.nextInt();

		System.out.println(fibonacci(inp));
	}
}