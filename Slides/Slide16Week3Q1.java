package Slides;
// Create a class called "Employee" with attributes name, employee ID, and

// salary.
// Implement a parameterized constructor and non- parameterized constructor to
// initialize
// these attributes.
// In a separate class, create an instance of the EmpDis class, display the
// information of
// employees by calling the overloaded constructor methods.

class Employee {
    String name;
    int employeeID; // i'd use long or string but whatever
    double salary;

    Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    Employee() {
        this.name = "Taher";
        this.employeeID = 10;
        this.salary = 0.0;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Taher", 10, 0.0);
        Employee e2 = new Employee();
        e1.displayInfo();
        e2.displayInfo();
    }
}