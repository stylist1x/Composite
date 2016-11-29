import javax.naming.OperationNotSupportedException;

/**
 * Created by Benedikt on 29.11.2016.
 */
public class Developer implements Employee
{
    private String name;
    private double salary;
    private String telnr;

    /**
     *
     * @param name
     * @param salary
     * @param telnr
     */
    public Developer(String name, double salary, String telnr)
    {
        this.name = name;
        this.salary = salary;
        this.telnr = telnr;
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
     * @param i
     * @return
     * @throws OperationNotSupportedException
     */
    public Employee getSubordinate(int i) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     * @return
     * @throws OperationNotSupportedException
     */
    public int countSubordinates() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
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
     * @throws OperationNotSupportedException
     */
    public void addEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     * @param employee
     * @throws OperationNotSupportedException
     */
    public void removeEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     */
    public void print()
    {

    }
}