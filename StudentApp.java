package com.analytics;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalGradePoints = 0;

        System.out.println("--- Student Performance Analytics System ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter details for Student " + i);
            System.out.print("Enter CAT Marks (30M): ");
            double cat = sc.nextDouble();
            System.out.print("Enter Assignment Marks (20M): ");
            double assign = sc.nextDouble();
            System.out.print("Enter FAT Marks (50M): ");
            double fat = sc.nextDouble();

            double total = cat + assign + fat;
            String grade = calculateGrade(total);
            double gpa = (total / 100) * 10; // Simple GPA scale 10

            System.out.println("Total Marks: " + total + "/100");
            System.out.println("Grade: " + grade);
            System.out.println("GPA: " + gpa);
            totalGradePoints += gpa;
        }
        System.out.println("\nOverall Class GPA: " + (totalGradePoints / 5));
    }

    public static String calculateGrade(double marks) {
        if (marks >= 90) return "O";
        else if (marks >= 80) return "A+";
        else if (marks >= 70) return "A";
        else if (marks >= 60) return "B+";
        else if (marks >= 50) return "B";
        else return "F";
    }
}
