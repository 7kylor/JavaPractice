package ESE_Slides_Activities.Unit1_Inheritance_Slides;
// d. Create a class called Employee with instance variables name, id, and

// salary, as well as methods to set and get the values of these variables.
// Then, create a subclass called Manager that adds additional instance
// variables bonus and teamSize and methods to set and get their values, as well
// as a method to calculate Bonus and total salary of the manager. Bonus = 200
// if team size is more than 50 else bonus is 100 . Total salary is (salary +
// bonus).Create Main class, create object of Manager class and call all the
// methods

class Employee_ESE_Slides {
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

class Manager_ESE extends Employee_ESE_Slides {
    int teamSize;
    double bonus;

    void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    int getTeamSize() {
        return teamSize;
    }

    double getBonus() {
        return bonus;
    }

    double calcBonus() {
        if (teamSize > 50) {
            return 200;
        } else {
            return 100;
        }
    }

    double calcTotalSalary() {
        return salary + calcBonus();
    }
}

class EmployeeMain_ESE_Slides {
    public static void main(String[] args) {
        Manager_ESE manager = new Manager_ESE();

        manager.setName("Manager Name");
        manager.setId(1);
        manager.setSalary(1000);
        manager.setTeamSize(100);

        System.out.println("Manager");
        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Team Size: " + manager.getTeamSize());
        System.out.println("Bonus: " + manager.calcBonus());
        System.out.println("Total Salary: " + manager.calcTotalSalary());
    }
}
