//Q15: Create an abstract class called “ InputOutput class” that has two
// abstract methods. Void getdata() and void putdata(). Create a class Teacher that extends from
// InputOutputClass with attributes teacher id, teacher name, salary. Implement the methods getdata()
// and putdata() to assign values to the Teacher class variables and display the values
// respectively. Create another class Student that extends from InputOutputClass with attributes Student id,
// Student name, GPA. Implement the methods getdata() and putdata() to assign values to the
// Student class variables and display the values respectively. Create a main class , create one object each for Teacher and Employee classes and call the methods respectively

abstract class InputOutputClass {
    abstract void getData();

    abstract void putData();
}

class Teacher extends InputOutputClass {
    String teacherId, teacherName;
    double salary;

    void getData() {
        teacherId = "111111111111";
        teacherName = "Teacher";
        salary = 100000.0;
    }

    void putData() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Salary: " + salary);
    }
}

class Student extends InputOutputClass {
    String studentId, studentName;
    double gpa;

    void getData() {
        studentId = "111111111111";
        studentName = "Student";
        gpa = 4.0;
    }

    void putData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("GPA: " + gpa);
    }
}

class InputOutputClassMain {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.getData();
        t.putData();

        Student s = new Student();
        s.getData();
        s.putData();
    }
}
