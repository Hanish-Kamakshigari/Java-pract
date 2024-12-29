import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        int product = a * b;
        int sum = a + b;
        int difference = b - a;
        
        System.out.println("Product: " + product);
        System.out.println("Sum: " + sum);
        System.out.println("Difference (second - first): " + difference);
        
        if (b != 0) {
            int division = a / b;
            System.out.println("Division (first / second): " + division);
        } else {
            System.out.println("Cannot divide by zero!");
        }
        
        sc.close();  // Close the scanner when done
    }
}
