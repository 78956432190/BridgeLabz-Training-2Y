package Level1;
import java.util.*;
public class Factorial1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        sc.close();
        int i;
        int fac=1;
        for(i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("Factorial of a number is:"+fac);
        
    }
}