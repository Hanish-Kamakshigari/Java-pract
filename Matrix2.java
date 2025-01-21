import java.util.Scanner;
public class Matrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,p;
        System.out.println("Enter the number of rows of matrix A: ");
        r=sc.nextInt();
        System.out.println("Enter the number of columns of matrix A and rows of matrix B: ");
        c=sc.nextInt();
        System.out.println("Enter the number of columns of matrix B: ");
        p=sc.nextInt();
        int[][] matrixA = new int[r][c];
        int[][] matrixB = new int[c][p];
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
                System.out.print("Element [" + (i+1) + "][" + (j+1) + "]: ");
matrixA[i][j]=sc.nextInt();
}
}
for(int i=0;i<c;i++){
    for(int j=0;j<p;j++) {
        System.out.print("Element [" + (i+1) +"][" + (j+1) + "]: ");
        matrixB[i][j]=sc.nextInt();
    }
}
int[][]matrixC= new int[r][p];
for(int i=0;i<r;i++){
for(int j=0;j<p;j++){
    matrixC[i][j]=0;
}
}
for(int i=0;i<r;i++){
    for(int j=0;j<p;j++){
        for(int k=0;k<c;k++){
            matrixC[i][j]=matrixC[i][j]+(matrixA[i][k]*matrixB[k][j]);
        }
    }
}
for(int i=0;i<r;i++){
    for(int j=0;j<p;j++){
        System.out.print(matrixC[i][j]+" ");
    }
    System.out.println();
}
sc.close();
}
}