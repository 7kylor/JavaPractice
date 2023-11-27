// Q2:  Write a Java program that contains a class named Student with instance variables for name,mark1, mark2, mark 3, mark4.The class should have four methods 1. Setvalues() for setting the values for class variables using parameters,2. Calculatetotalmarks() to calculate and return total marks, 3.calculategrade() to calculate and return student grade (e.g., A, B, C or fail based on, if totalmarks > 90, grade is A , if totalmarks between 90 and 70 , grade is B, if totalmarks between 50 and 70, grade is c , else F ) and 4. Display() to print these values respectively. Additionally, create another class named StudentOperations that contains the main method. Within the main method: Create objects of the Student class for multiple students. Set their names, and marks. Calculate totalmarks and display the grade of each student.

class Student {
  String name;
  int mark1, mark2, mark3, mark4;
  int totalMarks;
  char grade;

  void setValues(String name, int mark1, int mark2, int mark3, int mark4) {
      this.name = name;
      this.mark1 = mark1;
      this.mark2 = mark2;
      this.mark3 = mark3;
      this.mark4 = mark4;
    }

    int calculateTotalMarks() {
      totalMarks = mark1 + mark2 + mark3 + mark4;
      return totalMarks;
    }

    char calculateGrade() {
      if (totalMarks > 90) {
        grade = 'A';
      } else if (totalMarks > 70) {
        grade = 'B';
      } else if (totalMarks > 50) {
        grade = 'C';
      } else {
        grade = 'F';
      }
      return grade;
      }

      void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
      }
}

class StudentOperations {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setValues("Taher", 10, 20, 30, 40);
    s1.calculateTotalMarks();
    s1.calculateGrade();
    s1.display();

    Student s2 = new Student();
    s2.setValues("Taher", 90, 80, 70, 60);
    s2.calculateTotalMarks();
    s2.calculateGrade();
    s2.display();
    }
  }