// Q3: Write a Java program that contains a class named Employee with two instance variables: Salary and Bonus. The class should have the three methods: inputvalues(double s,double a). This
// assigns values to the variable Salary and Allowance using the values passed from the main
// method. calculateTotalSalary(). This method calculates and returns the total salary. The
// formula: totalsalary = Salary + Bonus. Display(). This method displays the salary, allowance and totalsalary. Create another class named EmployeeMain that contains the main method. Within the main method: Create an object of the Employee class. Using the object, call all methods, inputvalues(), calculateTotalSalary() and display()

class Employee {
    double salary, bonus;

    void inputValues(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return salary + bonus;
    }

    void display() {
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputValues(2000.0, 1600.0);
        emp.display();
    }
}

