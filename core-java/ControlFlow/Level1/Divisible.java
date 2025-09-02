package ControlFlow.Level1;
import java.util.*;
public class Divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("number is not divisible by 5");
        }
        sc.close();
    }

}