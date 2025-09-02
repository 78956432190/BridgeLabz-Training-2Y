package Level2;
import java.util.*;
public class Factor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        sc.close();
        if(n>0){
        System.out.println("factors of "+n+" are:");
        }
        else{
            System.out.println("enter the positive number:");
        }
        int i;
        for (i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        }
    }

