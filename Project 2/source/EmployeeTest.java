/**
 * The EmployeeTest class will test all of the method in Employee class. 
 * @author Bolong Yan
 * @see Employee
 */
public class EmployeeTest {
    
	/**
	 * The main method to test Employee class and print result in console. 
	 * .
	 */
    public static void main(String[] args) {
        Employee Employee = new Employee();
        Employee.setName("Bolong Yan");
        Employee.setSalary(80000.0);
        System.out.println("name:"+Employee.getName());
        System.out.println("salary:"+Employee.getSalary());
        System.out.println("After");   
        Employee.raiseSalary(5);
        System.out.println("name:"+Employee.getName());
        System.out.println("salary:"+Employee.getSalary());
    
    }

}