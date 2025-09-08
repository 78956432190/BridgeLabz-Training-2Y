package Level2;

import java.util.Scanner;

public class Factor {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i<= number; i++) {
            if (number % i == 0) count++;
        }

int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i<= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter number: ");
        int number = scan.nextInt();

int[] factors = findFactors(number);
        int sumOfSquares = sumOfSquares(factors);
        int product = productOfFactors(factors);

System.out.println("Factors: " + java.util.Arrays.toString(factors));
System.out.println("Sum of squares: " + sumOfSquares);
System.out.println("Product: " + product);
    }
}
