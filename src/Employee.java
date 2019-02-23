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

}
