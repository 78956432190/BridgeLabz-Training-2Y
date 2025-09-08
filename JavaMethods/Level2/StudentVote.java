package Level2;

import java.util.Scanner;

public class StudentVote {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int[] ages = new int[10];

        for (int i = 0; i< 10; i++) {
System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = scan.nextInt();
        }

        for (int age : ages) {
System.out.println(canStudentVote(age));
        }
    }
}
