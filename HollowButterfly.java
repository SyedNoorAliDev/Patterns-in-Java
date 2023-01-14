public class HollowButterfly{
    public static void main(String args[]){
        int n = 15;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((j==1)||(j==i)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if ((j==1)||(j==i)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.print("\n");
        }
        for (int l=n;l>=1;l--){
            for (int j=1;j<=l;j++){
                if ((j==1)||(j==l)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=1;k<=2*(n-l);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=l;j++){
                if ((j==1)||(j==l)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}