package Level2;
import java.util.*;
public class Multiple2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        sc.close();
        if(n>0 && n<100){
            int i=100;
            while(i>=1){
                if(i%n==0){
                    System.out.println(i);
                }
                i--;
            }
        }
        else{
            System.out.println("enter the positive number:");
        }
    }
}