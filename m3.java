import java.util.Scanner;
public class m3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        
        
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        c = sc.nextInt();
        

        
        
        int[][] matrixA = new int[r][c];
        int[][] matrixB = new int[r][c];
        
        
        System.out.println("\nEnter elements for Matrix A:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("\nEnter elements for Matrix B:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrixB[i][j] = sc.nextInt();
            }
        }
        
        
        int[][] matrixC = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        
        System.out.println("\nResultant Matrix C = A + B:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}