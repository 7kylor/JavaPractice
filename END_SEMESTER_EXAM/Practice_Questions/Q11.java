package Practice_Questions;
// 11.	Using JAVA program, Define a class  testResult with 5 instance variables namely moduleName, test1, test2, test3 , total and avg and 4 methods namely assign() to assign values to the instance variables, calcTotal() to calculate the total test score, calcAvg() to calculate the average test scores and display() to display the content of all the instance variables. Define a Main class with main method. Create an array of class testResult to store the results of 3 students. Assign values to all the 3 objects using assign() method and display the values of all variables using display() method. 

class TestResult_ESE {

    String moduleName;
    double test1, test2, test3, total, avg;

    void assign(String moduleName, double test1, double test2, double test3) {
        this.moduleName = moduleName;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    void calcTotal() {
        total = test1 + test2 + test3;
    }

    void calcAvg() {
        avg = total / 3;
    }

    void display() {
        System.out.println("Module Name: " + moduleName);
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

class testResultMain_ESE {
    public static void main(String[] args) {
        TestResult_ESE[] results = new TestResult_ESE[3];
        results[0] = new TestResult_ESE();
        results[1] = new TestResult_ESE();
        results[2] = new TestResult_ESE();

        results[0].assign("Maths", 17, 21, 30);
        results[1].assign("Physics", 13, 23, 33);
        results[2].assign("Psychology", 27, 20, 50);

        results[0].calcTotal();
        results[1].calcTotal();
        results[2].calcTotal();

        results[0].calcAvg();
        results[1].calcAvg();
        results[2].calcAvg();

        results[0].display();
        results[1].display();
        results[2].display();
    }
}