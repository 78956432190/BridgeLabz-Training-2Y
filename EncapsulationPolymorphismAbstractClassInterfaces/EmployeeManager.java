interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    protected String id, name;
    protected double baseSalary;

    public abstract double salary();

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String dept;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
        this.id=id; this.name=name; this.baseSalary=baseSalary; this.bonus=bonus;
    }

    public double salary() { return baseSalary + bonus; }

    public void assignDepartment(String dept) { this.dept=dept; }
    public String getDepartmentDetails() { return "Department: " + dept; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private double rate;
    private String dept;

    public PartTimeEmployee(String id, String name, int hours, double rate) {
        this.id=id; this.name=name; this.hours=hours; this.rate=rate;
    }

    public double salary() { return hours * rate; }

    public void assignDepartment(String dept) { this.dept=dept; }
    public String getDepartmentDetails() { return "Department: " + dept; }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Employee[] staff = {
            new FullTimeEmployee("F101","Alice",40000,5000),
            new PartTimeEmployee("P202","Bob",80,200)
        };

        ((FullTimeEmployee)staff[0]).assignDepartment("HR");
        ((PartTimeEmployee)staff[1]).assignDepartment("Support");

        for (Employee e : staff) {
            e.show();
            System.out.println(((Department)e).getDepartmentDetails());
        }
    }
}
