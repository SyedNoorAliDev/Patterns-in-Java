import java.util.*;
public class Butterfly{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Butterfly: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k=1;k<=((2*n)-(2*i));k++){
                System.out.print(" ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i2=1;i2<=n;i2++){
            for (int j2=n;j2>=i2;j2--){
                System.out.print("*");
            }
            for (int z=1;z<=((2*i2)-2);z++){
                System.out.print(" ");
            }
            for (int m=n;m>=i2;m--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}