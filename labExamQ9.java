// Q9: Create a Parent class named Employee. The class should have three
// instance variables: empname, empid and salary. Also Two methods: getData()
// and setData() . setData() function should assign some value for all the
// variables using parameters. getData() function should display/print the
// values of all the variables. Create a derived class named Manager of Employee
// class. The class should have One variable: Bonus. Also two methods :
// getBonus() and setBonus() . setBonus function should set the value for Bonus.
// getBonus() method should display the values of Bonus. Create a main class in
// which you need to create an 2 objects of class manager . Call all the
// functions of both parent and child classes to check their functionalities.

class Employee {
    String empname;
    int empid;
    double salary;

    void setData(String empname, int empid, double salary) {
        this.empname = empname;
        this.empid = empid;
        this.salary = salary;
    }

    void getData() {
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    void getBonus() {
        System.out.println("Employee Bonus: " + bonus);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setData("Taher", 1234567890, 7000.0);
        m1.setBonus(1000.0);
        m1.getData();
        m1.getBonus();

        Manager m2 = new Manager();
        m2.setData("Taher", 1234567890, 3000.0);
        m2.setBonus(999.0);
        m2.getData();
        m2.getBonus();
    }
}