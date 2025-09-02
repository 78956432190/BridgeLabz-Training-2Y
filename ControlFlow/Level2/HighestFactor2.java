package Level2;
import java.util.*;
public class HighestFactor2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        sc.close();
        int highest=1;
        int i=n-1;
        while(i>=1){
            if(n%i==0){
                highest=i;
             
                break;
            }
               i--;
        }
        System.out.println("Highest Factor :"+highest);
    }
}