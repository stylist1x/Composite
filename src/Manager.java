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
     * @param name
     * @param salary
     * @param telnr
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
     * @return
     */
    public String getName()
    {
        return this.name;
    }

    /**
     *
     * @param index
     * @return
     */
    public Employee getSubordinate(int index)
    {
        return employees.get(index);
    }

    /**
     *
     * @return
     */
    public int countSubordinates()
    {
        return employees.size();
    }

    /**
     *
     * @return
     */
    public double getSalary()
    {
        return this.salary;
    }

    /**
     *
     * @return
     */
    public String getTelNr()
    {
        return this.telnr;
    }

    /**
     *
     * @param employee
     */
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    /**
     *
     * @param employee
     */
    public void removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }

    /**
     *
     */
    public void print()
    {

    }
}