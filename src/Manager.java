import java.util.ArrayList;

/**
 * Created by Benedikt on 29.11.2016.
 */
public class Manager implements Employee
{

    private String name;
    private double salary;
    private String telnr;
    private ArrayList<Employee> employees;

    public Manager(String name, double salary, String telnr)
    {
        this.name = name;
        this.salary = salary;
        this.telnr = telnr;
        employees = new ArrayList<>();
    }

    public String getName()
    {

    }

    public Employee getSubordinate(int i)
    {

    }

    public int countSubordinates()
    {

    }

    public double getSalary()
    {

    }

    public int getTelNr()
    {

    }

    public void addEmployee(Employee employee)
    {

    }

    public void removeEmployee(Employee employee)
    {

    }

    public void print()
    {

    }

}
