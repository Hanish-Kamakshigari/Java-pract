import java.util.Scanner;
public class Transpose {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input rows and columns
    System.out.print("Enter rows and columns: ");
    int rows = scanner.nextInt();
    int cols = scanner.nextInt();

    // Input matrix elements
    int[][] matrix = new int[rows][cols];
    int[][] transpose = new int[cols][rows];
    System.out.println("Enter the matrix elements:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = scanner.nextInt();
        }
    }

    // Print original matrix
    System.out.println("Original Matrix:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    // Fill transpose array
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }

    System.out.println("Transposed Matrix:");
    // Print transpose array instead of matrix
    for (int i = 0; i < cols; i++) {
        for (int j = 0; j < rows; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();
}
}


