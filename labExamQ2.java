// Q2:  Write a Java program that contains a class named Student with instance variables for name,mark1, mark2, mark 3, mark4.The class should have four methods 1. Setvalues() for setting the values for class variables using parameters,2. Calculatetotalmarks() to calculate and return total marks, 3.calculategrade() to calculate and return student grade (e.g., A, B, C or fail based on, if totalmarks > 90, grade is A , if totalmarks between 90 and 70 , grade is B, if totalmarks between 50 and 70, grade is c , else F ) and 4. Display() to print these values respectively. Additionally, create another class named StudentOperations that contains the main method. Within the main method: Create objects of the Student class for multiple students. Set their names, and marks. Calculate totalmarks and display the grade of each
// student

class Student {
  String name;
  double mark1, mark2, mark3, mark4;

  void setValues(double mark1, double mark2, double mark3, double mark4, String name) {
    this.name = name;
    this.mark1 = mark1;
    this.mark2 = mark2;
    this.mark3 = mark3;
    this.mark4 = mark4;
  }

  double calculateTotalMarks() {
    double total = this.mark1 + this.mark2 + this.mark3 + this.mark4;
    return total;
  }

  String calculateGrade() {
    double total = calculateTotalMarks();
    String grade;
    if (total > 90) {
      grade = "A";
    } else if (total <= 90 && total >= 70) {
      grade = "B";
    } else if (total <= 70 && total >= 50) {
      grade = "C";
    } else {
      grade = "F";
    }
    return grade;
  }

  void Display() {
    System.out.println("Student Name: " + this.name);
    System.out.println("Mark 1: " + this.mark1);
    System.out.println("Mark 2: " + this.mark2);
    System.out.println("Mark 3: " + this.mark3);
    System.out.println("Mark 4: " + this.mark4);
    System.out.println("Grade: " + calculateGrade());
  }
}

class StudentOperation {
  public static void main(String[] args) {
    Student St = new Student();

    String name = "test";
    double m1 = 93.1, m2 = 98.3, m3 = 99.1, m4 = 95.3;
    St.setValues(m1, m2, m3, m4, name);
    St.Display();
  }
}
