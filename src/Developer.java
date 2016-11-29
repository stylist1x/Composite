import javax.naming.OperationNotSupportedException;

/**
 * Created by Benedikt on 29.11.2016.
 */
public class Developer implements Employee
{
    private String name;
    private double salary;
    private String telnr;

    public Developer(String name, double salary, String telnr)
    {
        this.name = name;
        this.salary = salary;
        this.telnr = telnr;
    }

    public String getName()
    {

    }

    public Employee getSubordinate(int i) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    public int countSubordinates() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    public double getSalary()
    {

    }

    public int getTelNr()
    {

    }

    public void addEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    public void removeEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    public void print()
    {

    }
}
