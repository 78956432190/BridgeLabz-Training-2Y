package Level2;

import java.util.Scanner;

public class Friend {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) {
            if (age < min) min = age;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int[] ages = new int[3];
int[] heights = new int[3];

        for (int i = 0; i< 3; i++) {
System.out.print("Enter age of friend " + (i+1) + ": ");
            ages[i] = scan.nextInt();
System.out.print("Enter height of friend " + (i+1) + ": ");
            heights[i] = scan.nextInt();
        }

System.out.println("Youngest age: " + findYoungest(ages));
System.out.println("Tallest height: " + findTallest(heights));
    }
}

