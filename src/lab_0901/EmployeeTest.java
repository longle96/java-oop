package lab_0901;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee EmployeeA = new FTE();
        Employee EmployeeB = new FTE();
        Employee EmployeeC = new FTE();
        Employee EmployeeD = new CE();
        Employee EmployeeE = new CE();

        List<Employee> employeeList = Arrays.asList(EmployeeA, EmployeeB, EmployeeC, EmployeeD, EmployeeE);

        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total the salary is: " + totalSalary + " USD");
    }
}
