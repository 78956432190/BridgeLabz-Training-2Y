package Level2;
import java.util.*;
public class OddEven2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        sc.close();
        int i;
        for(i=1;i<=n;i++){
        if(i%2==0){
            System.out.println("Even number:"+i);

        }
        else{
            System.out.println("Odd number:"+i);
        }
    }
}
}