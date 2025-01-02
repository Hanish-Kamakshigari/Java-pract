import java.util.Scanner;
public class Factorial {
    static int x (int y){
        if (y==0||y==1){
            return 1;
        }
        else{
            return y*x(y-1);
        }
    }
    public static void main(String[] args) {
     //   int a, sum=1;
Scanner scanner=new Scanner(System.in);
//System.out.println("Enter the number:");
 //a=scanner.nextInt();
//while(a>=1){
   // sum=sum*a;
    //a--;
//}
//System.out.println("The factorial of the number" +" " + sum);
System.out.println("Enter the number: ");
int y=scanner.nextInt();
System.out.println("Result: "+" "+x(y));
scanner.close();
    }
}
