package Level2;

import java.util.Scanner;

public class Sum {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter n: ");
        int n = scan.nextInt();

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

System.out.println("Recursive sum: " + recursiveSum);
System.out.println("Formula sum: " + formulaSum);
System.out.println(recursiveSum == formulaSum);
    }
}
