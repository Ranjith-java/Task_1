import java.util.Scanner;
public class Solution5{
    public static void main(String[] agrs){
        int purchasevalue=0,netamount=0,flag=0,discount=0;
        System.out.println("Enter the purchase amount");
        Scanner s=new Scanner(System.in);
        purchasevalue=s.nextInt();
        if(purchasevalue<500){
            flag=1;
        }else if(purchasevalue>=500&&purchasevalue<=1000){
            flag=2;
        }else if(purchasevalue>1000){
           flag=3;
        }else{
            flag=0;
       }
        switch(flag){
            case 1:
                netamount=purchasevalue;
                System.out.println("Netamount with no discount "+netamount);
                break;
            case 2:
                discount=purchasevalue/100*10;
                netamount=purchasevalue-discount;
                System.out.println("Netamount with 10% discount "+ netamount);
                break;
            case 3:
                discount=purchasevalue/100*20;
                netamount=purchasevalue-discount;
                System.out.println("Netamount with 20% discount "+ netamount);
                break;
            default:
                System.out.println("no result");
                break;
        }
    }
}
