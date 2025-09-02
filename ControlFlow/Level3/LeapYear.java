package Level3;
import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        sc.close();
        if(year >= 1582){
            if(year % 400 == 0){
                System.out.println(year + " is a Leap Year (checked using if-else).");
            } else if(year % 100 == 0){
                System.out.println(year + " is NOT a Leap Year (checked using if-else).");
            } else if(year % 4 == 0){
                System.out.println(year + " is a Leap Year (checked using if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked using if-else).");
            }
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                System.out.println(year + " is a Leap Year (checked using single if).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked using single if).");
            }

        } else {
            System.out.println("Year must be >= 1582 (Gregorian Calendar).");
        }
    }
}

