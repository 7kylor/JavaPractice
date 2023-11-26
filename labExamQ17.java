// Q17. Create an interface called Tax with a data member Taxrate that has value
// of .05. It has three member functions
/// 1. calcTax () to return calculated tax (tax = salary* taxrate)
// 2. CalcNetsalary () to calculate and return net salary ( netsalary = gross
// salary- tax),
// 3. Display() to display gross salary, Tax and net salary.
// Create a class Salary that implements interface tax. This class has one data
// member for gross salary. One constructor to assign value to the data member using parameter.
// Create a main class which has main method. Create an object of Salary class. Call the
// methods display to display gross salary, Tax and net salary .

interface Tax {
    double taxRate = 0.05;

    double calcTax(double salary);

    double calcNetSalary(double salary);

    void display(double salary);
}

class Salary implements Tax {
    double grossSalary;

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
