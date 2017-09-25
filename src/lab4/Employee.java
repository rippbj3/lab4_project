package lab4;

/**
 * Employee.java
 */

public class Employee implements Rules {

    private String name;
    private double salary;

    /**
     * default constructor
     */
    public Employee() {
        name = "new employee";
        salary = 0;
    }

    /**
     * constructor with employee name and salary
     * @param inName - name of employee
     * @param inSalary - salary of employee
     */
    public Employee(String inName, double inSalary) {
        name = inName;
        salary = inSalary;
    }

    /**
     * Get employee's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set employee's name
     * @param inName
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * get employee's salary
     * @return salary of employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * set employee's salary
     * @return salary of employee
     */
    public void setSalary(double inSalary) {
        salary = inSalary;
    }

    /**
     * gives info about employee
     * @return employee name and salary
     */
    public String toString() {
        return "Employee " + name + " earns " + salary;
    }
}
