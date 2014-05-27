/**
   A class to test the DataSet class.
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet computer = new DataSet();

      computer.addValue(55);
      computer.addValue(3);
      computer.addValue(27);
      computer.addValue(12);

      int sum = computer.getSum();
      double average = computer.getAverage();
      int min = computer.getMin();
      int max = computer.getMax();

      System.out.println("sum:"+sum);
      System.out.println("average:"+average);     
      System.out.println("min:"+min);
      System.out.println("max:"+max);       
 


   }
}
