// j 1. Create a class called "Employee" with attributes: name, employee ID, and salary. Implement a
// parameterized constructor to initialize these attributes. Include a method to display employee details.
// Create a Main class and the main Method. Inside this class, create an array of "Employee" class to
// store 3 objects. Display the details of employees earning the highest salary.
// (50 marks)

class Employee {
    String name;
    int employeeID;
    double salary;

    Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Taher", 1, 10000);
        employees[1] = new Employee("Test Emp 1", 2, 20000);
        employees[2] = new Employee("Test Emp 2", 3, 30000);

        double maxSalary = 0;
        int maxSalaryIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = employees[i].salary;
                maxSalaryIndex = i;
            }
        }

        System.out.println("Employee with highest salary:");
        employees[maxSalaryIndex].display();
    }
}
