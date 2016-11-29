import java.util.*;

/**
 * Created by Benedikt on 29.11.2016.
 */

public class Manager implements Employee
{

    private String name;
    private double salary;
    private String telnr;
    private ArrayList<Employee> employees;

    /**
     *
     * @param name name of the manager
     * @param salary salary of the manager
     * @param telnr phone number of the manager
     */
    public Manager(String name, double salary, String telnr)
    {
        this.name = name;
        this.salary = salary;
        this.telnr = telnr;
        employees = new ArrayList<>();
    }

    /**
     *
     * @return the Name of the manager
     */
    public String getName()
    {
        return this.name;
    }

    /**
     *
     * @param index the manager you want to get returned
     * @return the manager you selected
     */
    public Employee getSubordinate(int index)
    {
        return employees.get(index);
    }

    /**
     *
     * @return the number of the Subordinates
     */
    public int countSubordinates()
    {
        return employees.size();
    }

    /**
     *
     * @return the Salary of the manager
     */
    public double getSalary()
    {
        return this.salary;
    }

    /**
     *
     * @return the phone number of the manager
     */
    public String getTelNr()
    {
        return this.telnr;
    }

    /**
     *
     * @param employee the manager you want to add
     */
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    /**
     *
     * @param employee the manager you want to remove
     */
    public void removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }

    /**
     *This method prints the Data of the manager
     */
    public void print()
    {
        System.out.println("#################");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("Phone Number = " + getTelNr());
        System.out.println("#################");
        System.out.println();

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            employee.print();
        }
    }
}