/**
 * The Employee class represents a Employee's name and salary. 
 * @author Bolong Yan
 */
public class DataSet {

    private int sum;
    private int max;
    private double average;
    private int count;


    /** full constructor */
    public DataSet() {
    	sum = 0;
    	count =0;
    	max = 0;
    }


	/**
	 * Records the random num and caculate.
	 * 
	 * @param num
	 *            the input random num
	 */
	public void recordNum(int num) {
		sum = sum + num;
		max = Math.max(max, num);
		count++;
		average = sum/count;		
	}


	public int getMax() {
		return max;
	}

	public double getAverage() {
		return average;
	}


}