import javax.naming.OperationNotSupportedException;

/**
 * Created by Benedikt on 29.11.2016.
 */
public class Runner {

    public static void main(String [ ] args) throws OperationNotSupportedException {

        Employee employee1 = new Developer("Everett P. Durden", 10000, "805-644-5017");
        Employee employee2 = new Developer("Willie L. Moody", 15000, "207-515-2233");
        Employee secondmanager = new Manager("Byron A. Larsen", 25000, "415-252-1547");

        secondmanager.addEmployee(employee1);
        secondmanager.addEmployee(employee2);

        Employee employee3 = new Developer("Donna E. John", 20000, "954-543-3718");

        Manager firstManager = new Manager("Craig L. Ornelas", 50000, "478-628-5226");

        firstManager.addEmployee(employee3);
        firstManager.addEmployee(secondmanager);

        firstManager.print();
    }
}
