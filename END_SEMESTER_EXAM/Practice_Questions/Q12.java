
// 12.	Create a class called Employee with instance variables name, id, and salary, as well as methods to set and get the values of these variables. Then, create a subclass called Manager that adds additional instance variables bonus and teamSize and methods to set and get their values, as well as a method to calculate  Bonus and  total salary of the manager. Bonus = 200 OMR if teamSize is more than 50 else bonus is 100 OMR . Total salary is salary + bonus. Create a Main class, create object of Manager class and call all the methods

class Employee_ESE {
    String name;
    int id;
    double salary;

    void setName(String name) {
        this.name = name;
    }

    void setID(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getID() {
        return id;
    }

    double getSalary() {
        return salary;
    }
}

class Manager_ESE extends Employee_ESE {
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

class Employee_Main_ESE {
    public static void main(String[] args) {
        Manager_ESE manager = new Manager_ESE();
        manager.setName("Taher");
        manager.setID(123333);
        manager.setSalary(1099);
        manager.setTeamSize(51);

        System.out.println("Name: " + manager.getName());
        System.out.println("ID: " + manager.getID());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Team Size: " + manager.getTeamSize());
        System.out.println("Bonus: " + manager.calcBonus());
        System.out.println("Total Salary: " + manager.calcTotalSalary());
    }
}
