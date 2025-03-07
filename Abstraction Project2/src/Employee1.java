// Abstract class Employee
abstract class Employee {
    String name;
    int employeeId;

    // Constructor
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to be implemented by subclasses
    abstract void calculateSalary();

    // Concrete method to display employee details
    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private final int salary = 50000; // Fixed salary

    // Constructor
    FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    // Implementing abstract method
    void calculateSalary() {
        System.out.println("Salary: ₹" + salary);
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private final int hourlyRate = 500; // ₹500 per hour

    // Constructor
    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }

    // Implementing abstract method
    void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Salary: ₹" + salary);
    }
}

// Main class to execute the program
public class Employee1{
    public static void main(String[] args) {
        // Creating FullTimeEmployee object
        FullTimeEmployee emp1 = new FullTimeEmployee("Ramya", 101);
        emp1.showDetails();
        emp1.calculateSalary();

        System.out.println();

        // Creating PartTimeEmployee object
        PartTimeEmployee emp2 = new PartTimeEmployee("Sharmi", 102, 20); // 20 hours worked
        emp2.showDetails();
        emp2.calculateSalary();
    }
}

