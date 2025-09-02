package Level1;
import java.util.*;
public class Countdown2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("here is the countdown");
        sc.close();
    }
    
}