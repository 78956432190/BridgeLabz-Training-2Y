package Level1;
import java.util.*;
public class Smallestno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if((number1<number2) && (number1<number3)){
            System.out.println("number1 is the smallest");
        }
        else if((number2<number1) && (number2<number3)){
            System.out.println("number 2 is the smallest");
        }
        else{
            System.out.println("Number3 is the smallest");
        }
        sc.close();
    }
}