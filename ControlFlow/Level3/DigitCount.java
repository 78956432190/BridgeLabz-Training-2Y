package Level3;
import java.util.*;

public class DigitCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        sc.close();

        int count = 0;
        int originalNumber = number;
        if(number == 0){
            count = 1;
        } else {
            while(number != 0){
                number = number / 10;  
                count++;               
            }
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}
