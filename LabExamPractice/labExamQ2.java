// Q2:  Write a Java program that contains a class named Student with instance variables for name,mark1, mark2, mark 3, mark4.The class should have four methods 1. Setvalues() for setting the values for class variables using parameters,2. Calculatetotalmarks() to calculate and return total marks, 3.calculategrade() to calculate and return student grade (e.g., A, B, C or fail based on, if totalmarks > 90, grade is A , if totalmarks between 90 and 70 , grade is B, if totalmarks between 50 and 70, grade is c , else F ) and 4. Display() to print these values respectively. Additionally, create another class named StudentOperations that contains the main method. Within the main method: Create objects of the Student class for multiple students. Set their names, and marks. Calculate totalmarks and display the grade of each student.

class Student {
  String name;
  float mark1, mark2, mark3, mark4;

  void setValues(String name, float mark1, float mark2, float mark3, float mark4) {
      this.name = name;
      this.mark1 = mark1;
      this.mark2 = mark2;
      this.mark3 = mark3;
      this.mark4 = mark4;
    }

    float calculateTotalMarks() {
      return mark1 + mark2 + mark3 + mark4;
    }

    String calculateGrade() {
      float total = calculateTotalMarks();
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
    student2.setValues("Test", 60, 70, 65, 75);
    student2.display();
    }
  }