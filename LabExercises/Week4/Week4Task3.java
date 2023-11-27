// Create  a  class  called  "Employee"  with  attributes  empName,  empID,  and  salary.  Implement  the 
// concept of constructor overloading by having a parameterized constructor and non- 
// parameterized constructor to initialize the class attributes. The class should also have a method 
// display to print the value of the attributes. In a separate class, create two instances/objects of the Employee class, one using parameterized 
// constructor and other using non parameterized constructor. Display the information of the two 
// employees by calling the display method.

class Employee {
    String empName;
    int empID;
    double salary;

    Employee() {
        empName = "Taher";
        empID = 1;
        salary = 1000;
    }

    Employee(String empName, int empID, double salary) {
        this.empName = empName;
        this.empID = empID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee salary: " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Taher", 2, 2000);

        employee1.display();
        employee2.display();
    }
}