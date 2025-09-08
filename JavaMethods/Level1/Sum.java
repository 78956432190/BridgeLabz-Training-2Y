package Level1;

import java.util.Scanner;

public class Sum {
    public static int sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i<= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter n: ");
        int n = scan.nextInt();

        int result = sumOfNNumbers(n);
System.out.println(result);
    }
}
