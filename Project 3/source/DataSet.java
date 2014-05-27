/**
 * This class computes the sum,average,min and max of a sequence of integers.
 */
public class DataSet {
	private int min;
	private int max;	
	private int count;
	private int sum;
	private double average;	
	

	/**
	 * Constructs a DataSet with integers.
	 */
	public DataSet() {
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;		
		count = 0;
		sum =0;
		average = 0;

	}

	/**
	 * Records and caculate.
	 * 
	 * @param value
	 */
	public void addValue(int value) {
		sum = sum + value;
		min = Math.min(min,value);
		max = Math.max(max, value);
		count++;
	}


	/**
	 * Caculates average.
	 * 
	 * @return average
	 */
	public double getAverage() {
		average = sum/count;

		return average;
	}
	
	/**
	 * Caculates sum.
	 * 
	 * @return sum
	 */	
	public int getSum() {
		return sum;
	}

	/**
	 * Caculates min.
	 * 
	 * @return min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Caculates max.
	 * 
	 * @return max
	 */	
	public int getMax() {
		return max;
	}	

	
}
