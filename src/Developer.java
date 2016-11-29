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
     * @param name the name of the developer
     * @param salary the salary of the developer
     * @param telnr the phone number of the developer
     */
    public Developer(String name, double salary, String telnr)
    {
        this.name = name;
        this.salary = salary;
        this.telnr = telnr;
    }

    /**
     *
     * @return the name of the developer
     */
    public String getName()
    {
        return this.name;
    }

    /**
     *
     * @param i not used, because the method is no supported
     * @return nothing, because the method is no supported
     * @throws OperationNotSupportedException Constructs a new instance of OperationNotSupportedException
     */
    public Employee getSubordinate(int i) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     * @return nothing, because the method is nod supported
     * @throws OperationNotSupportedException Constructs a new instance of OperationNotSupportedException
     */
    public int countSubordinates() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     * @return the salary of the developer
     */
    public double getSalary()
    {
        return this.salary;
    }

    /**
     *
     * @return the phone number of the developer
     */
    public String getTelNr()
    {
        return this.telnr;
    }

    /**
     *
     * @param employee not used, because the method is no supported
     * @throws OperationNotSupportedException Constructs a new instance of OperationNotSupportedException
     */
    public void addEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *
     * @param employee not used, because the method is no supported
     * @throws OperationNotSupportedException Constructs a new instance of OperationNotSupportedException
     */
    public void removeEmployee(Employee employee) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     *This method prints the data of the developer
     */
    public void print()
    {
        System.out.println("#################");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("Phone Number = " + getTelNr());
        System.out.println("#################");
        System.out.println();
    }
}