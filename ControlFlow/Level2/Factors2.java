package Level2;
import java.util.*;
public class Factors2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt();
        sc.close();
        if(n>0){
        System.out.println("factors of "+n+" are:");
        }
        else{
            System.out.println("enter the postive number:");
        }
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.println("factors is:"+i);
           
            }   
             i++;         
        }
    }
}