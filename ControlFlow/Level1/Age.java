package Level1;
import java.util.*;
public class Age {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of a person:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote .");
        }
        else{
            System.out.println(" Not Eligible for vote");
        }
        sc.close();
    }
}