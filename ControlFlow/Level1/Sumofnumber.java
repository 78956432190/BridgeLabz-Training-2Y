package Level1;
import java.util.*;
public class Sumofnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        int sum=0;
        while(i>=1){
            sum=sum+i;
            i--;
            if(i<0){
                break;
            }
        }
                    System.out.println("sum is:"+sum);
        sc.close();
    }
}