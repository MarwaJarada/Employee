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

        /* If we want to test sorting methods:
        sortBySalaryTEST(employees);
        sortByNameTEST(employees);
*/


    }

    public static Employee[] sortBySalary(Employee[] employees){
        for (int i=0 ; i<employees.length ; i++){
            for (int x=0 ; x<employees.length ; x++){
                if (employees[i].getSalary()<employees[x].getSalary()){
                    Employee employeeTemp = employees[i];
                    employees[i]=employees[x];
                    employees[x]=employeeTemp;

                }
            }
        }
        return employees;

    }

    public static Employee[] sortByName(Employee[] employees){
        for (int i=0 ; i<employees.length ; i++){
            for (int x=0 ; x<employees.length ; x++){
                if (employees[i].getName().compareTo(employees[x].getName())<0){
                    Employee employeeTemp = employees[x];
                    employees[x]=employees[i];
                    employees[i]=employeeTemp;

                }
            }
        }
        return employees;

    }

    public static void sortBySalaryTEST(Employee[] employees){
            for (int x= 0; x < employees.length; x++) {
                Employee[] employeesSortedBySalary = sortBySalary(employees);
                System.out.println(employeesSortedBySalary[x].getName());
            }
    }


    public static void sortByNameTEST(Employee[] employees){
        for (int x= 0; x < employees.length; x++) {
            Employee[] employeesSortedByName = sortByName(employees);
            System.out.println(employeesSortedByName[x].getName());
        }
    }
}
