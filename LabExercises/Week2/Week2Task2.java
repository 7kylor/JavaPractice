// Task 2
// Write a Java program that contains a class named Student with instance
// variables for name, age, and
// grade. The class should have methods for setting these values and calculating
// a student's status (e.g.,
// pass or fail based on grade).
// Additionally, create another class named StudentOperations that contains the
// main method. Within the
// main method: Create objects of the Student class for multiple students.
// Set their names, ages, and grades.
// Calculate and display the status of each student (pass or fail).

class Student {
    String name;
    int age;
    double grade;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGrade(double grade) {
        this.grade = grade;
    }

    void printStatus() {
        if (grade >= 50) {
            System.out.println(name + " passed.");
        } else {
            System.out.println(name + " failed.");
        }
    }
}

class StudentOperations {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Taher");
        s1.setAge(25);
        s1.setGrade(90);
        s1.printStatus();

        Student s2 = new Student();
        s2.setName("Taher");
        s2.setAge(24);
        s2.setGrade(40);
        s2.printStatus();
    }
}