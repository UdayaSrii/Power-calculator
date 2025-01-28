import java.util.Scanner;
public class PowerCalculator{
    // Create a method to calculate the power of a number
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        // The base number
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();
        // The result of the power calculation
        double result = Math.pow(base, exponent);
        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}

