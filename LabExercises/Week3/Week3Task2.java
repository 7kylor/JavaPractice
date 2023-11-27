// 2. Define a class called Employee with four data members: name, id, position,
// and salary, and two member functions: void input() to assign input values using parameters passed
// from the main method and void display() to display the values. Appropriate data types are
// to be chosen for the data members. Define another class that hosts the main method. Inside the
// main method: Create an instance/object of the Employee class. Call the input(), display()
// methods using the instance/object created.

class Employee {
    String name, position;
    int id;
    double salary;

    void input(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input("Taher", 133, 1700.0);
        emp.display();
    }
}