package Practice_Questions;
// 8. Create a diagram and justify inheritance hierarchy that could be used to

// represent the following classes with appropriate attributes and operations:
// person, employee, full-time employee, manager, student.
// Implement the above inheritance hierarchy using JAVA. Write the code for each
// class and include the attributes and necessary methods as given below:

// 1. Person class:
// • Variables: id and name
// • Methods: void input details() to assign some values to variables. void
// displaydetails() – to display the values of the variables.
// 2. Employee class:
// • void getsalary() prints “employee earns salary”
// 3. fulltimeemployee class:
// • void paidleave() prints “can take one month paid leave”
// 4. manager class:
// • void getbonus() prints “ gets bonus every month”
// 5. student class:
// • void getmarks() prints “ gets marks for the modules”
// Additionally, create a main method in a Main class to demonstrate the
// behavior of the different person types. Inside the main method. Create an
// instance of the manager class And Create an instance of the student class.
// Call the methods of these two classes using the objects created.

class Person {
    int id;
    String name;

    void inputDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    void getSalary() {
        System.out.println("Employee earns salary");
    }
}

class FullTimeEmployee extends Employee {
    void paidLeave() {
        System.out.println("Can take one month paid leave");
    }
}

class Manager extends Employee {
    void getBonus() {
        System.out.println("Gets bonus every month");
    }
}

class Student extends Person {
    void getMarks() {
        System.out.println("Gets marks for the modules");
    }
}

class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        Student s = new Student();
        m.inputDetails(1, "Taher");
        s.inputDetails(2, "Test");
        m.displayDetails();
        m.getSalary();
        m.getBonus();
        s.displayDetails();
        s.getMarks();
    }
}
