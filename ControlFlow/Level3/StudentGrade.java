package Level3;

import java.util.*;

public class StudentGrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        sc.close();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        String grade;
        String remarks;

        if(percentage >= 90){
            grade = "A+";
            remarks = "Excellent Performance";
        } else if(percentage >= 75){
            grade = "A";
            remarks = "Very Good Performance";
        } else if(percentage >= 60){
            grade = "B";
            remarks = "Good Performance";
        } else if(percentage >= 50){
            grade = "C";
            remarks = "Average Performance";
        } else if(percentage >= 35){
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail - Work Harder Next Time";
        }
        System.out.println("\n--- Result ---");
        System.out.println("Physics Marks  : " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Maths Marks    : " + maths);
        System.out.println("Total Marks    : " + total);
        System.out.println("Average Marks  : " + percentage + "%");
        System.out.println("Grade          : " + grade);
        System.out.println("Remarks        : " + remarks);
    }
}