import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numOfSubjects, totalMarks = 0;
        double averagePercentage;
        
        System.out.print("Enter the number of subjects: ");
        numOfSubjects = scanner.nextInt();

        int[] marks = new int[numOfSubjects];
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculating total marks
        // Calculating average percentage
        averagePercentage = (double) totalMarks / numOfSubjects;

        // Grade Calculation based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Displaying results
        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
