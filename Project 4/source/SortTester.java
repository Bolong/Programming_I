import java.util.Scanner;

/**
 * A class to test the SortFloat class and SortString class.
 */
public class SortTester {
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);

	System.out.println("Please enter three numbers:");
	double num1 = in.nextDouble();
	double num2 = in.nextDouble();
	double num3 = in.nextDouble();

	SortFloat s = new SortFloat(num1, num2, num3);
    s.sort();
	System.out.println("The inputs in sorted order are:\n"
	+ s.getMin() + "\n"
	+ s.getMid() + "\n"
	+ s.getMax());
	
	System.out.println("Please enter three strings:");
	String str0 = in.nextLine();
	String str1 = in.nextLine();
	String str2 = in.nextLine();
	String str3 = in.nextLine();	

	SortString t = new SortString(str1, str2, str3);

	System.out.println("The inputs in sorted order are:\n"
			+ t.getSmallest() + "\n"
			+ t.getMiddle() + "\n"
			+ t.getLargest());
	}
	}

