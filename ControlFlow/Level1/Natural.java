package Level1;
import java.util.*;
public class Natural {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n =sc.nextInt();
        if(n>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("Negative number");
        }
        int sum=n*(n+1)/2;
        System.out.println("Sum of the natural number is :"+sum);
        sc.close();
    }
}