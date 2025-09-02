package Inheritance;

public class Calculator {
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Example usage of the overloaded methods
        int sum1 = myCalculator.add(5, 3);
        int sum2 = myCalculator.add(4, 6, 2);
        double sum3 = myCalculator.add(3, 2);

        // Output the results
        System.out.println("Sum of 5 and 3: " + sum1);
        System.out.println("Sum of 4, 6, and 2: " + sum2);
        System.out.println("Sum of 3.5 and 2.7: " + sum3);
    }
}