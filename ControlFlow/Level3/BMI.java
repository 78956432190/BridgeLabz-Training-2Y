package Level3;
import java.util.*;

public class BMI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();

        sc.close();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if(bmi < 18.5){
            status = "Underweight";
        } else if(bmi < 24.9){
            status = "Normal weight";
        } else if(bmi < 29.9){
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.println("\n--- BMI Result ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightM + " m");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}