package Level1;
import java.util.*;

public class SumNaturalNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int i = 1;
            int sumLoop = 0;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumLoop);
            System.out.println("Sum using formula   : " + sumFormula);
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("Mismatch in results.");
            }
        }

        sc.close();
    }
}