import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter the number of terms: ");
        n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print("Fibonacci Series" +" "+ a + " "+ b );
        for(i=3;i<=n;++i){
            c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }
        sc.close();
    }
}
