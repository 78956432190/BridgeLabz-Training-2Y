package Level1;
import java.util.Scanner;

public class Rounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter side 1: ");
        double a = scan.nextDouble();
System.out.print("Enter side 2: ");
        double b = scan.nextDouble();
System.out.print("Enter side 3: ");
        double c = scan.nextDouble();

        double rounds = calculateRounds(a, b, c);
System.out.printf("%.2f rounds needed%n", rounds);
    }
}
