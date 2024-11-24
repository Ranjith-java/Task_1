import java.util.Scanner;
public class Solution3{
    public static void main(String[] agrs){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value");
        int i=s.nextInt();
        System.out.println("The reverse value of given number");
        // usind do whie to reverse the number
        do{
            int j=i%10;            // it will give reminder value
            System.out.print(j);
            j=i/10;                 // this will give quotient
            // swap the quotient to run the loop
            int k=j;
            i=k;
        }while(i>0);
    }
}
