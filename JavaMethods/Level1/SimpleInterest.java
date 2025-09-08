package Level1;
import java.util.Scanner;

public class SimpleInterest{
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter Principal: ");
        double principal = scan.nextDouble();
System.out.print("Enter Rate: ");
        double rate = scan.nextDouble();
System.out.print("Enter Time: ");
        double time = scan.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", 
                          interest, principal, rate, time);
    }
}
