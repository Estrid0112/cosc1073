package week4_prac;

import java.util.Scanner;

public class Ex7 {

    public static double milesToLaps(double miles){
        return 4.0 * miles;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number in miles: ");
        double numMiles = scanner.nextDouble();

        System.out.println(milesToLaps(numMiles));


    }
}
