package Level2;

import java.util.Scanner;

public class Roots {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[]{};

        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter a: ");
        double a = scan.nextDouble();
System.out.print("Enter b: ");
        double b = scan.nextDouble();
System.out.print("Enter c: ");
        double c = scan.nextDouble();

double[] roots = findRoots(a, b, c);
System.out.println(java.util.Arrays.toString(roots));
    }
}

