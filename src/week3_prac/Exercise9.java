package week3;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // read inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Side1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of Side2");
        double side2 = scanner.nextDouble();

        // calculation
        double area = side1 * side2;
        double perimeter = (side1 + side2) * 2;

        // print out results
        System.out.printf("Side1 = %5.2f, Side2 = %5.2f, Area = %6.2f, Perimeter = %7.2f", side1, side2, area, perimeter);
    }
}
