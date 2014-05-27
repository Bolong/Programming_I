/**
 * The Employee class represents a Employee's name and salary. 
 * @author Bolong Yan
 */
public class Employee {

    // Fields
    private String myname;
    private double mysalary;

    /** default constructor */
    public Employee() {
    }

    /** full constructor */
    public Employee(String name, double salary) {
        myname = name;
        mysalary = salary;
    }

    /**
     * return the Employee's name
     * @return myname
     */
    public String getName() {
        return myname;
    }

    /**
     * set the Employee's name
     * @param name the Employee's name you want to set
     */
    public void setName(String name) {
        myname = name;
    }

    /**
     * return the Employee's salary
     * @return mysalary
     */
    public Double getSalary() {
        return mysalary;
    }

    /**
     * set the Employee's salary
     * @param salary the Employee's salary you want to set
     */
    public void setSalary(double salary) {
        mysalary = salary;
    }

    /**
     * caculate the Employee's salary by percentRaise
     * @param percentRaise the raise percent of the Employee's salary
     */
    public void raiseSalary(double percentRaise) {

        mysalary = mysalary + (mysalary * percentRaise/100);
    }

}