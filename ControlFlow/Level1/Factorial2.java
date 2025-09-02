package Level1;
import java.util.*;
public class Factorial2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        sc.close();
        int i=1;
        int fac=1;
        while(i<=n){
            fac=fac*i;
            i++;
        }
        System.out.println("Factorial of a number is:"+fac);
        
    }
}