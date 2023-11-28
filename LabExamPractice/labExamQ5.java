// Q5: Define a class called Employee with four data members: name, id,
// position, and salary, and two member functions: void input() to assign input values using parameters passed
// from the main method and void display() to display the values. Appropriate data types are
// to be chosen for the data members. Define another class that hosts the main method. Inside the
// main method: Create an instance/object of the Employee class. Call the input(), display()
// methods using the instance/object created.

class Employee {
    private String name;
    private int id;
    private String position;
    private double salary;

    public void input(String name, int id, String position, double salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.input("Taher", 123456789, "Manager", 100000);
        employee.display();
    }
}
