package Level2;
import java.util.*;
public class FizzBuzz2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter th positive number:");
        int n=sc.nextInt();
        sc.close();
        if(n>0){
            System.out.println("The FizzBuzz series from 1 to " + n + " is:");
        } else {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int i=0;
        while(i<n){
            i++;
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
}
}