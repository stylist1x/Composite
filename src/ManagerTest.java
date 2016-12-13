import static org.junit.Assert.*;

/**
 * Created by Benedikt on 13.12.2016.
 */
public class ManagerTest {

    Employee employee1;
    Employee employee2;
    Employee secondManager;

    Employee employee3;

    Manager firstManager;

    @org.junit.Before
    public void setUp() throws Exception {

        firstManager = new Manager("Peter", 2000, "123456");
        employee1 = new Developer("Everett P. Durden", 10000, "805-644-5017");
        employee2 = new Developer("Willie L. Moody", 15000, "207-515-2233");
        secondManager = new Manager("Byron A. Larsen", 25000, "415-252-1547");

        secondManager.addEmployee(employee1);
        secondManager.addEmployee(employee2);

        Employee employee3 = new Developer("Donna E. John", 20000, "954-543-3718");

        firstManager = new Manager("Craig L. Ornelas", 50000, "478-628-5226");

        firstManager.addEmployee(employee3);
        firstManager.addEmployee(secondManager);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getName() throws Exception {
        String name = "Peter";

        assertTrue(name.equals(firstManager.getName()));
    }

    @org.junit.Test
    public void getSubordinate() throws Exception {

        assertTrue(secondManager.getSubordinate(0).equals(employee1));
    }

    @org.junit.Test
    public void countSubordinates() throws Exception {
        int subordiantes = 2;

        assertTrue(secondManager.countSubordinates() == subordiantes);
    }

    @org.junit.Test
    public void getSalary() throws Exception {
        double salary = 25000;

        assertTrue(secondManager.getSalary() == salary);
    }

    @org.junit.Test
    public void getTelNr() throws Exception {
        String telnr = "415-252-1547";

        assertTrue(secondManager.getTelNr().equals(telnr));
    }

    @org.junit.Test
    public void addEmployee() throws Exception {

        Employee testemployee = new Developer("Peter", 50000, "478-628-5226");
        secondManager.addEmployee(testemployee);
        assertTrue(secondManager.getSubordinate(2).equals(testemployee));
    }

    @org.junit.Test
    public void removeEmployee() throws Exception {

        int employees = 1;
        secondManager.removeEmployee(employee1);
        assertTrue(secondManager.countSubordinates() == employees);
    }

}