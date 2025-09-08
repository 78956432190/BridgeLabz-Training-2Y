package Level2;

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        return weight / ((height / 100.0) * (height / 100.0));
    }

    public static String getBMIStatus(double bmi) {
        if (bmi<= 18.4) return "Underweight";
        if (bmi<= 24.9) return "Normal";
        if (bmi<= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
double[][] data = new double[10][3];

        for (int i = 0; i< 10; i++) {
System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = scan.nextDouble();
System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = scan.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i< 10; i++) {
System.out.printf("Person %d: Weight %.2f, Height %.2f, BMI %.2f, Status: %s%n",
                              i+1, data[i][0], data[i][1], data[i][2], getBMIStatus(data[i][2]));
        }
    }
}
