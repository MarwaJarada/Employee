import javax.swing.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainJOptionPane {
    public static void main(String[] args) {


        Employee[] employees = new Employee[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
           // JOptionPane jOptionPane= new JOptionPane()
            String employeeName=  JOptionPane.showInputDialog("Enter Emlpoyee name:");
            String employeeDepartment = JOptionPane.showInputDialog("Enter Employee Salary");
            String employeeSalary = JOptionPane.showInputDialog("Enter Employee Salary :");
            Employee employee = new Employee(employeeName, employeeDepartment, Double.parseDouble(employeeSalary));
            employees[i] = employee;


        }
        Employee.sortBySalary(employees);
        Employee.showSortedDataBySalary(employees);
        JOptionPane.showMessageDialog(null,showSortedDataIOptionPane(employees));
        System.out.println(Employee.getCount());


    }

    public static String showSortedDataIOptionPane(Employee[] employees){
        String sortedData = "";
        Employee[] employeesSortedBySalary=Employee.sortBySalary(employees);
        sortedData=sortedData+("Name\tDepartment\tSalary");
        for (int x=0 ;x<employeesSortedBySalary.length ; x++){
            sortedData = sortedData+"\n"+employeesSortedBySalary[x].getName()
                    +"\t"+employeesSortedBySalary[x].getDepatment()
                    +"\t"+employeesSortedBySalary[x].getSalary();

        }
        return sortedData;

    }

    public static String showSortedDataByNameIOptionPane(Employee[] employees){
        String sortedData = "";
        Employee[] employeesSortedBySalary=Employee.sortByName(employees);
        sortedData=sortedData+("Name\tDepartment\tSalary");
        for (int x=0 ;x<employeesSortedBySalary.length ; x++){
            sortedData = sortedData+"\n"+employeesSortedBySalary[x].getName()
                    +"\t"+employeesSortedBySalary[x].getDepatment()
                    +"\t"+employeesSortedBySalary[x].getSalary();

        }
        return sortedData;

    }
}