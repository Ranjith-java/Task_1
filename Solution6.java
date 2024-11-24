import java.util.Scanner;
public class Solution6{
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        int i,j,k=5,n=0,z=5;
        for(i=1;i<=k;i++){ //outer for loop to print row wise
            n=5;
            for(j=1;j<=i;j++){ //first inner loop to print triangle in descending value
                System.out.print(n);
                n--;
            }
            for(j=k-1;j>=i;j--){ // second inner loop to print triangle with same value
               System.out.print(z);
            }
            z--;
            System.out.println();
        }
    }
}
