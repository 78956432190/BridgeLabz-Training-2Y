package Level2;
import java.util.*;
public class HighestFactor {
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n =sc.nextInt();
        sc.close();
        int highest=1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                highest=i;
                break;
            }
           
        }
         System.out.println("highest factor is:"+highest);
    }
}