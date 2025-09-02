package Level1;
import java.util.*;
public class Countdown {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        while(i>=1){
            System.out.println(i);
            i--;
        }
        System.out.println("here is the countdown");
        sc.close();
    }
}