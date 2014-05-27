import java.util.Scanner;

/**
 * The FibonacciRunner class will test the method in FibonacciGenerator class.
 * 
 * @author Bolong Yan
 * @see FibonacciGenerator
 */
public class FibonacciRunner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		FibonacciGenerator fg = new FibonacciGenerator();
		for (int i = 1; i <= n; i++)
			System.out.println(fg.nextNumber());
	}
}