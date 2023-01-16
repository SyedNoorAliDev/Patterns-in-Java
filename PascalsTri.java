public class PascalsTri{
    public static void main(String args[]){
        int n = 20
        ;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if ((k==1) || (k==i)){
                    System.out.print("1 ");
                } else if (((k==2)||(k==(i-1))) && (i>2)){
                    System.out.print((i-1)+" ");
                } else {
                    System.out.print((2*(i-2))+" ");
                }
            }
            System.out.print("\n");
        }
    }
}