// 2. Create a class called Employee with instance variables name, id, and
// salary, as well as methods to set and get the values of these variables.
// Then, create a subclass called Manager that adds additional instance
// variables bonus and teamSize and methods to set and get their values, as well
// as a method to calculate Bonus and total salary of the manager. Bonus = 200
// OMR if teamSize is more than 50 else bonus is 100 OMR . Total salary is
// salary + bonus. Create a Main class, create object of Manager class and call
// all the methods

class Employee {
    String name;
    int id;
    double salary;

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;
    int teamSize;

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    double getBonus() {
        return bonus;
    }

    int getTeamSize() {
        return teamSize;
    }

    double calculateBonus() {
        if (teamSize > 50) {
            return 200;
        } else {
            return 100;
        }
    }

    double calculateTotalSalary() {
        return salary + calculateBonus();
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Taher");
        manager.setId(1);
        manager.setSalary(1000);
        manager.setTeamSize(100);
        manager.setBonus(manager.calculateBonus());

        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Team Size: " + manager.getTeamSize());
        System.out.println("Bonus: " + manager.getBonus());
        System.out.println("Total Salary: " + manager.calculateTotalSalary());
    }
}