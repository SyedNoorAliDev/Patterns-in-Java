public class HollowRhombus{
    public static void main(String args[]){
        int n = 20;
        for (int i=1;i<=n;i++){
            for (int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if ((i==1)||(i==n)||(j==1)||(j==n)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}