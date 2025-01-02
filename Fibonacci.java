import java.util.Scanner;
public class Fibonacci {
    static int x(int y){
        if(y==0){
            return 0;
        }
        else if(y==1){
            return 1;
        }
        else{
            return x(y-1)+x(y-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
int n=sc.nextInt();
System.out.print("The fibonacci series : "+" ");
for(int i=0;i<n;i++){
    System.out.print(x(i)+" ");
}
sc.close();
    }
}
