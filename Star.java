import java.util.Scanner;
public class Star{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,r,c;
        System.out.println("Enter the number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter the choice");
        System.out.println("1.Star Pattern");
        System.out.println("2.Reverse star pattern");
c=sc.nextInt();
switch(c){
    case 1:
    for(i=1;i<=r;i++){
        for(j=1;j<=i;j++){
System.out.print("^");
        }
        System.out.println();
    }
    break;
    case 2:
    for(i=r;i>=1;i--){
        for(j=1;j<=i;j++){
System.out.print("^");
        }
        System.out.println();
    }
    break;
    default:
    System.out.println("Invalid choice");
    break;
}
sc.close();
    }
}
