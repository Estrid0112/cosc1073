package week3_prac;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark of the first student:");
        int mark1 = scanner.nextInt();

        System.out.println("Enter the mark of the second student:");
        int mark2 = scanner.nextInt();

        System.out.println("Enter the mark of the third student:");
        int mark3 = scanner.nextInt();

        // calculation
        double avgScore = (mark1 + mark2 + mark3) / 3.0;

//        double maxScore = Math.max(mark1, mark2);
//        maxScore = Math.max(maxScore, mark3);

        double maxScore = Math.max(Math.max(mark1, mark2), mark3);
        double minScore = Math.min(Math.min(mark1, mark2), mark3);

        // print out results
        System.out.printf("The average score is %f, the minimum score is %f, and the maximum score is %f.", avgScore, minScore, maxScore);

    }
}
