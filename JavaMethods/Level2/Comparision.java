package Level2;

import java.util.Scanner;

public class Comparision {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int[] numbers = new int[5];

        for (int i = 0; i< 5; i++) {
System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scan.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
System.out.println(number + " is positive and even");
                } else {
System.out.println(number + " is positive and odd");
                }
            } else {
System.out.println(number + " is negative");
            }
        }

System.out.println("Comparison: " + compare(numbers[0], numbers[4]));
    }
}

