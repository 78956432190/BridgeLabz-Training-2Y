package Level1;
import java.util.*;
public class Sumofnumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double total = 0.0; 
        double number;    
        System.out.println("Enter numbers (enter 0 to stop):");
        number = sc.nextDouble(); 
        while (number != 0) {
            total += number;      
            number = sc.nextDouble(); 
        }
        System.out.println("The total sum is: " + total);
        sc.close();
    } 
}