package Level1;

import java.util.Scanner;

public class MinMax {
    public static int[] findMinMax(int a, int b, int c) {
        int min = a, max = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (b > max) max = b;
        if (c > max) max = c;
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter first number: ");
        int a = scan.nextInt();
System.out.print("Enter second number: ");
        int b = scan.nextInt();
System.out.print("Enter third number: ");
        int c = scan.nextInt();

int[] result = findMinMax(a, b, c);
System.out.println("Smallest: " + result[0]);
System.out.println("Largest: " + result[1]);
    }
}
