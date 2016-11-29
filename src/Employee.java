import javax.naming.OperationNotSupportedException;

/**
 * Created by Benedikt on 29.11.2016.
 */
public interface Employee {

    public void addEmployee(Employee employee) throws OperationNotSupportedException;
    public void removeEmployee(Employee employee) throws OperationNotSupportedException;
    public Employee getSubordinate(int i) throws OperationNotSupportedException;
    public int countSubordinates() throws OperationNotSupportedException;
    public String getName();
    public double getSalary();
    public void print();
    public int getTelNr();


}
