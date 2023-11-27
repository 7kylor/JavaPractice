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
class Student {
    String name;
    int mark1, mark2, mark3, mark4;

    void setValues(String name, int mark1, int mark2, int mark3, int mark4) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    int calculateTotalMarks() {
        return mark1 + mark2 + mark3 + mark4;
    }

    String calculateGrade() {
        int total = calculateTotalMarks();
        if (total > 90) {
            return "A";
        } else if (total >= 70) {
            return "B";
        } else if (total >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Grade: " + calculateGrade());
    }
}

class StudentOperations {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setValues("Taher", 85, 90, 80, 70);
        student1.display();

        Student student2 = new Student();
        student2.setValues("Taher", 60, 70, 65, 75);
        student2.display();
    }
}