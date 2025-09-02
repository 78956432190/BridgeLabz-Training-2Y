package Level1;
import java.util.*;
public class Largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if((number1>number2)&& (number1>number3)){
            System.out.println("number1 is the greatest");
        }
        else if((number1>number2)&& (number1>number3)){
             System.out.println("number2 is the greatest");
        }
        else{
             System.out.println("number3 is the greatest");
        }
        sc.close();
    }
}