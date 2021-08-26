package week3_prac;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter V in volts:");
        double volt = scanner.nextDouble();

        System.out.println("Enter I in amperes:");
        double current = scanner.nextDouble();

        // calculation
        double resistence = volt/current;

        // print out results
//        System.out.println("Resistance R is: " + resistence + " ohms");
        System.out.printf("Resistance R is: %5.2f ohms", resistence);

    }
}
