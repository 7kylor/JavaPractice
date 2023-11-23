class Employee {
    double salary, bonus;

    void inputValues(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return this.salary + this.bonus;
    }

    void display() {
        System.out.println("The total salary is " + calculateTotalSalary());
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputValues(3898.13, 545.3);
        emp.calculateTotalSalary();
        emp.display();
    }
}
