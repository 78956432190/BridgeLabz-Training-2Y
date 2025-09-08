package Level2;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        if (year % 4 == 0 && year % 100 != 0) return true;
        if (year % 400 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter year: ");
        int year = scan.nextInt();

System.out.println(isLeapYear(year));
    }
}
