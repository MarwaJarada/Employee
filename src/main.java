import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Employee[] employees = new Employee[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter Employee Name :");
            String employeeName = input.nextLine();
            System.out.print("Enter Employee Department :");
            String employeeDepartment = input.nextLine();
            System.out.print("Enter Employee Salary :");
            String employeeSalary = input.nextLine();
            Employee employee = new Employee(employeeName, employeeDepartment, Double.parseDouble(employeeSalary));
            employees[i] = employee;

        }

        Employee.sortBySalary(employees);
        Employee.showSortedDataBySalary(employees);
        Employee.sortByName(employees);
        Employee.showSortedDataByName(employees);
        System.out.println(Employee.getCount());
        System.out.println(" THE NUMBER OF EMPLOYEES IS :" + Employee.count);


    }

}
