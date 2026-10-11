import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class Employee {

    // Encapsulation: private data members
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name,
                    String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("---------------------------");
    }
}

// Employee Management class
public class EmployeeManagementApp {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Employee> employees =
            new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 0:
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // Add employee
    public static void addEmployee() {

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findEmployee(id) != null) {
            System.out.println("Employee ID already exists.");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            return;
        }

        Employee emp = new Employee(id, name, department, salary);
        employees.add(emp);

        System.out.println("Employee added successfully!");
    }

    // View all employees
    public static void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

    // Search employee
    public static void searchEmployee() {

        System.out.print("Enter employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee emp = findEmployee(id);

        if (emp != null) {
            emp.displayDetails();
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Update employee
    public static void updateEmployee() {

        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee emp = findEmployee(id);

        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter new name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter new department: ");
        emp.setDepartment(sc.nextLine());

        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        if (salary < 0) {
            System.out.println("Invalid salary. Old salary retained.");
        } else {
            emp.setSalary(salary);
        }

        System.out.println("Employee updated successfully!");
    }

    // Delete employee
    public static void deleteEmployee() {

        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee emp = findEmployee(id);

        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Helper method to find an employee by ID
    private static Employee findEmployee(int id) {

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }

        return null;
    }
}
