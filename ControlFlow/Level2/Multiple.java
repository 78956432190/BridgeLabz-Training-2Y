package Level2;
import java.util.*;
public class Multiple {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        sc.close();
        if(n>0 && n<100){
            for(int i=100;i>=1;i--){
                if(i%n == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("enter the positive number");
        }
    }
}