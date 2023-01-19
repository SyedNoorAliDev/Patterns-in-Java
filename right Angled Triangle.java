public class RightAngledTriangle{
// This is for printing right angled triangle
    public static void main(String args[]){
        int n = 6;
        for (int i=1; i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}