/**
 * @author Bolong Yan
 *
 */
public class FibonacciGenerator {

    // Fields
    private int num1;
    private int num2;
    private int numN;    
    private int n;
	
    /** full constructor */
    public FibonacciGenerator() {
        num1 = 1;
        num2 = 1;
        n = 1;
    }

    /**
     * Calculate numN by n
     * @return numN
     */
	public int nextNumber() {
		// TODO Auto-generated method stub
		if(n<3){
		   numN = num1;
		}else{
			numN = num1+num2;
			num1 = num2;
			num2 = numN;			
		}
		n++;
		return numN;
	}

}
