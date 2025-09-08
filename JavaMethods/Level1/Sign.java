package Level1;

import java.util.Scanner;

public class Sign {
    public static int checkSign(int number) {
        if (number < 0) return -1;
        if (number > 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter number: ");
        int number = scan.nextInt();

        int result = checkSign(number);
System.out.println(result);
  scan.close();
    }
}
