import java.util.Random;

/**
 * The RandomDataAnalyzer class will Print out the average and the maximum of random numbers from DataSet class.
 * 
 * @author Bolong Yan
 * @see DataSet
 */
public class RandomDataAnalyzer {

	public static void main(String[] args)
	 {
	 Random generator = new Random();
	 DataSet dataset = new DataSet();	 
	 for(int i=0;i<100;i++){
		 int d = generator.nextInt(1001);
		 System.out.print("Num"+(i+1)+":"+d+",");
         dataset.recordNum(d);
	 }
	 System.out.println();	 
	 System.out.println("the average of random numbers:"+dataset.getAverage());
	 System.out.println("the maximum of random numbers:"+dataset.getMax());	 
	 }
}
