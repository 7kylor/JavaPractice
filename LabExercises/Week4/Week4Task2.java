// Create a Parent class named Employee. The class should have three instance
// variables:
// empname, empid and salary. Also Two methods: getData() and setData() .
// setData() function
// should assign some value for the variables using parameters. getData()
// function should display
// the values of the variables. Create a derived class named Manager of Employee
// class. The class
// should have One variable: Bonus. Also two methods : getBonus() and setBonus()
// . setBonus
// function should set the values for Bonus. getBonus() method should display
// the values of Bonus.
// Create a main class in which you need to create an 2 objects of class manager
// .Call all the
// functions of both parent and child classes to check their functionalities.

class Employee {
    String empname;
    int empid;
    double salary;

    void getData(String empname, int empid, double salary) {
        this.empname = empname;
        this.empid = empid;
        this.salary = salary;
    }

    void setData() {
        System.out.println("Employee name: " + empname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void getBonus() {
        System.out.println("Bonus: " + bonus);
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();

        manager1.getData("Taher", 1, 1000);
        manager1.setBonus(100);
        manager1.setData();
        manager1.getBonus();

        manager2.getData("Taher", 2, 2000);
        manager2.setBonus(200);
        manager2.setData();
        manager2.getBonus();
    }
}
