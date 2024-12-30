import java.util.Scanner;

public class calsi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Basic Calculator");

        System.out.println("Enter number 1 & 2:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println("Enter the operator:");
        char C = scanner.next().charAt(0);

        if (C == '+') {
            System.out.println("Result: " + (A + B));
        } else if (C == '-') {
            System.out.println("Result: " + (A - B));
        } else if (C == '*') {
            System.out.println("Result: " + (A * B));
        } else if (C == '/') {
            if (B != 0) {
                System.out.println("Result: " + (A / B));
            } else {
                System.out.println("Error: Division by zero is not allowed!");
            }
        } else {
            System.out.println("Operator not valid. Try again.");
        }

        scanner.close();
    }
}
