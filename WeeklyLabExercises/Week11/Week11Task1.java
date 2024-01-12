// 1.	Using JAVA program, Define a class  testResult with 5 instance variables namely moduleName, test1, test2, test3 , total and avg and 4 methods namely assign() to assign values to the instance variables, calcTotal() to calculate the total test score, calcAvg() to calculate the average test scores and display() to display the content of all the instance variables. Define a Main class with main method. Create an array of class testResult to store the results of 3 students. Assign values to all the 3 objects using assign() method and display the values of all variables using display() method. 

class TestResult {
    String moduleName;
    int test1;
    int test2;
    int test3;
    int total;
    double avg;

    void assign(String moduleName, int test1, int test2, int test3) {
        this.moduleName = moduleName;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    void calcTotal() {
        total = test1 + test2 + test3;
    }

    void calcAvg() {
        avg = total / 3.0;
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

class TestResultMain {
    public static void main(String[] args) {
        TestResult[] testResults = new TestResult[3];
        testResults[0] = new TestResult();
        testResults[1] = new TestResult();
        testResults[2] = new TestResult();

        testResults[0].assign("Module 1", 10, 20, 30);
        testResults[1].assign("Module 2", 40, 50, 60);
        testResults[2].assign("Module 3", 70, 80, 90);

        for (int i = 0; i < testResults.length; i++) {
            testResults[i].calcTotal();
            testResults[i].calcAvg();
            testResults[i].display();
        }
    }
}