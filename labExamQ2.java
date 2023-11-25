// Q2:  Write a Java program that contains a class named Student with instance variables for name,mark1, mark2, mark 3, mark4.The class should have four methods 1. Setvalues() for setting the values for class variables using parameters,2. Calculatetotalmarks() to calculate and return total marks, 3.calculategrade() to calculate and return student grade (e.g., A, B, C or fail based on, if totalmarks > 90, grade is A , if totalmarks between 90 and 70 , grade is B, if totalmarks between 50 and 70, grade is c , else F ) and 4. Display() to print these values respectively. Additionally, create another class named StudentOperations that contains the main method. Within the main method: Create objects of the Student class for multiple students. Set their names, and marks. Calculate totalmarks and display the grade of each student.

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
      int totalMarks = calculateTotalMarks();
      if (totalMarks > 90) {
        return "A";
      } else if (totalMarks > 70) {
        return "B";
      } else if (totalMarks > 50) {
        return "C";
      } else {
        return "F";
      }
      }

      void display() {
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Mark 4: " + mark4);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Grade: " + calculateGrade());
      }
}

class StudentOperations {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setValues("Taher", 100, 100, 100, 100);
    s1.display();

    Student s2 = new Student();
    s2.setValues("Taher", 70, 90, 80, 90);
    s2.display();

    Student s3 = new Student();
    s3.setValues("Taher", 10, 40, 50, 80);
    s3.display();

      Student s4 = new Student();
      s4.setValues("Taher", 70, 60, 30, 90);
      s4.display();
    }
  }