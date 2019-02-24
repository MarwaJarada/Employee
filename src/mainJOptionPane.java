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

        Employee.showSortedData(employees);
        System.out.println(Employee.getCount());


    }
}