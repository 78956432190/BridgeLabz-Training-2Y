package Level2;

import java.util.Scanner;

public class AverageMinMax {
    public static int[] generate4DigitRandomArray(int size) {
int[] array = new int[size];
        for (int i = 0; i< size; i++) {
            array[i] = (int)(Math.random() * 9000) + 1000;
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter size: ");
        int size = scan.nextInt();

int[] randomNumbers = generate4DigitRandomArray(size);
double[] result = findAverageMinMax(randomNumbers);

System.out.println("Average: " + result[0]);
System.out.println("Min: " + result[1]);
System.out.println("Max: " + result[2]);
    }
}
