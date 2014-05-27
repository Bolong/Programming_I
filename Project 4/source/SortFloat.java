import java.util.ArrayList;
import java.util.List;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */

/**
 * This class finds the smallest, middle, and largest of three numbers.
 */
public class SortFloat {
	private double x;
	private double y;
	private double z;
	private double min;
	private double mid;
	private double max;

	/**
	 * Constructs a data set that processes three numbers.
	 * 
	 * @param num1
	 *            the first number to sort
	 * @param num2
	 *            the second number to sort
	 * @param num3
	 *            the third number to sort
	 */
	public SortFloat(double num1, double num2, double num3) {
		x = num1;
		y = num2;
		z = num3;
	}

	/**
	 * Sort the numbers in the data set.
	 */
	public void sort() {
		min = Math.min(x, Math.min(y, z));
		max = Math.max(x, Math.max(y, z));
		if (x > min && x < max) {
			mid = x;
		} else if (y > min && y < max) {
			mid = y;
		} else if (z > min && z < max) {
			mid = x;
		} else if (x == min) {
			mid = x;
		} else if (y == min) {
			mid = x;
		} else if (z == min) {
			mid = x;
		}
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMid() {
		return mid;
	}

	public void setMid(double mid) {
		this.mid = mid;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

}