class Employee {

    // Method to be overridden
    double calculateSalary() {
        return 20000;
    }
}

class Manager extends Employee {

    // Method Overriding
    @Override
    double calculateSalary() {
        return 50000;   // Manager has higher salary
    }
}

class Printer {

    // Method Overloading
    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(String text, int copies) {
        System.out.println("Printing " + copies + " copies of: " + text);
    }
}

public class Company {

    public static void main(String[] args) {

        // Overriding Example
        Employee emp = new Manager();   // Runtime polymorphism
        System.out.println("Salary: " + emp.calculateSalary());

        // Overloading Example
        Printer p = new Printer();
        p.print("Annual Report");
        p.print("Invoice", 3);
    }
}
