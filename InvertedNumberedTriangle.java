public class InvertedNumberedTriangle{
    public static void main(String args[]){
        int n = 9;
        for (int i=1;i<n+1;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}