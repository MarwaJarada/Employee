public class Employee {
    private String name;
    private String depatment;
    private double salary;
    public static int count;

    public Employee(String name, String depatment, double salary) {
        count++;
        this.name = name;
        this.depatment = depatment;
        this.salary = salary;
    }

    public Employee() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepatment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary , double bonus) {
        this.salary = salary+(salary*bonus);
    }

    public static int getCount(){
        return count;
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
    public static void showSortedDataBySalary(Employee[] employees){
        Employee[] employeesSortedBySalary=sortBySalary(employees);
        System.out.printf("%10s %10s %10s \n","Name","Department" , "Salary");
        for (int x=0 ;x<employeesSortedBySalary.length ; x++){
            System.out.printf("%10s %10s %10s \n",employeesSortedBySalary[x].getName()
                    ,employeesSortedBySalary[x].getDepatment()
                    ,employeesSortedBySalary[x].getSalary());

        }
    }

    public static void showSortedDataByName(Employee[] employees){
        Employee[] employeesSortedBySalary=sortByName(employees);
        System.out.printf("%10s %10s %10s \n","Name","Department" , "Salary");
        for (int x=0 ;x<employeesSortedBySalary.length ; x++){
            System.out.printf("%10s %10s %10s \n",employeesSortedBySalary[x].getName()
                    ,employeesSortedBySalary[x].getDepatment()
                    ,employeesSortedBySalary[x].getSalary());

        }
    }
}
