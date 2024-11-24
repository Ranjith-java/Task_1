import java.util.Scanner;
public class Solution4{
    public static void main(String[] agrs){
        int num1,num2,num3;
        Scanner s= new Scanner(System.in);
        // getting values from console
        System.out.println("enter the value num1");
        num1=s.nextInt();
        System.out.println("enter the value num2");
        num2=s.nextInt();
        System.out.println("enter the value num3");
        num3=s.nextInt();
        System.out.print("Smallest of three number is ");
        // using if else and logical operator to find smallest of 3 values
        if(num1<num2&&num1<num3){
            System.out.print(num1);
        }else if(num2<num3){
            System.out.print(num2);
        }else{
            System.out.print(num3);
        }
    }
}