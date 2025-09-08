package Level1;

import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter number: ");
        int number = scan.nextInt();
System.out.print("Enter divisor: ");
        int divisor = scan.nextInt();

int[] result = findQuotientAndRemainder(number, divisor);
System.out.println("Quotient: " + result[0]);
System.out.println("Remainder: " + result[1]);
    }
}
