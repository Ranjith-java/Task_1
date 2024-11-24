import java.util.Scanner;
public class Solution2{
    public static void main(String[] agrs){
        int givennumber;
        // get the value from console
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        givennumber=s.nextInt();
        System.out.println("Given number is " + givennumber);
        // using if to find number is negative or positive
        if(givennumber<0){
            System.out.println("Entered value is negative");
        }else{
            System.out.println("Entered value is positive");
        }
   }
}
