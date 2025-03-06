import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        
        Employee emp1 = new Employee(101, "Rohit Sharma", 50000);
        Employee emp2 = new Employee(102, "Virat Kohli", 60000);
        Employee emp3 = new Employee(103, "KL Rahul", 55000);
        Employee emp4 = new Employee(104,"Hardik Pandya",52000);

        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("----------------------");
        }
    }
}
