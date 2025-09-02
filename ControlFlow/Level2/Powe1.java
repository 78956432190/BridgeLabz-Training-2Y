package Level2;
import java.util.*;
public class Power1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and power:");
        int n=sc.nextInt();
        int p=sc.nextInt();
        sc.close();
        int result=1;
        int i;
        for(i=1;i<=p;i++){
            result=result*n;
        }
        System.out.println("number raised to the power is:"+result);

    }
}