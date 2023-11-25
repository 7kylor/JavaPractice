// Q11: Create a class called "Employee" with attributes empName, empID, basic
// salary and House allowance. Implement the concept of constructor overloading by having a
// parameterized constructor and non- parameterized constructor to initialize the class
// attributes. The class should also have a method called calculatetotalsalary()
// which calculates and returns the totalsalary(total of basic salary and house
// allowance).Display() method must print the value of the all class variables
// and total salary. In a separate class, create two instances/objects of the
// Employee class, one using parameterized constructor and other using non
// parameterized constructor. Display the information of the two employees by
// calling the display method.

class Employee {
    String empName;
    int empID;
    double basicSalary, houseAllowance;

    // Constructor overloading (non-parameterized)
    Employee() {
        empName = "Taher";
        empID = 123456789;
        basicSalary = 7000.0;
        houseAllowance = 100.0;
    }

    // Constructor overloading (parameterized)
    Employee(String empName, int empID, double basicSalary, double houseAllowance) {
        this.empName = empName;
        this.empID = empID;
        this.basicSalary = basicSalary;
        this.houseAllowance = houseAllowance;
    }

    double calculateTotalSalary() {
        return basicSalary + houseAllowance;
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee House Allowance: " + houseAllowance);
        System.out.println("Employee Total Salary: " + calculateTotalSalary());
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.display();

        Employee emp2 = new Employee("Taher", 123456799, 2000.0, 1300.0);
        emp2.display();
    }
}