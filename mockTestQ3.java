// Q3 Given  an  interface  called  Tax  with  a  data  member  taxRate  that  has  a  value  of  0.05  and  member 

// functions/methods calcTax() to calculate the income tax, calcNet() to calculate the net salary and display()  to display the gross salary, the income tax and the net salary. 

//Note: Tax Amount is calculated as salary * taxrate.Net salary is calculated as gross salary-Tax Amount. 

// Now given a class called Salary with the data member gSalary and a constructor to assign value to the data  member using parameter passing. Show how the class will be implemented while also implementing the 
// interface Tax. 

// >> note this question is smiler to labExamQ17.java //

interface Tax {
    double taxRate = 0.05;

    double calcTax(double salary);

    double calcNetSalary(double salary);

    void display(double salary);
}

class Salary implements Tax {
    double grossSalary; // gSalary

    Salary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double calcTax(double salary) {
        return salary * taxRate;
    }

    public double calcNetSalary(double salary) {
        return salary - calcTax(salary);
    }

    public void display(double salary) {
        System.out.println("Gross Salary: " + salary);
        System.out.println("Tax: " + calcTax(salary));
        System.out.println("Net Salary: " + calcNetSalary(salary));
    }
}

class TaxMain {
    public static void main(String[] args) {
        Salary s = new Salary(100000.0);
        s.display(s.grossSalary);
    }
}