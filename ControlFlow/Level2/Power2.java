package Level2;
import java.util.*;
public class Power2 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and power:");
        int n=sc.nextInt();
        int p=sc.nextInt();
        sc.close();
        int result=1;
        int i=1;
        while(i<=p){
            result=result*n;
             i++;
        }
       
        System.out.println("number raised to the power is:"+result);

    }
}
