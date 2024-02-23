import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of subjects
        System.out.println("Please enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        // Prompt user to enter the scores for each subject
        System.out.println("Enter the scores for each subject:");
        double totalScore = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Score for subject " + i + ": ");
            double score = scanner.nextDouble();
            totalScore += score;
        }

        // Calculate average grade
        double averageGrade = totalScore / numOfSubjects;

        // Display the average grade
        System.out.println("Your average grade is: " + averageGrade);

        scanner.close();
    }
}
