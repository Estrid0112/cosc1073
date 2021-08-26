package week4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                // is a century year
                if (year % 400 == 0){
                    System.out.println(year + " - leap year");
                }else{
                    System.out.println(year + " - not a leap year");
                }
            }else{
                System.out.println(year + " - leap year");
            }
        }else{
            System.out.println(year + " - not a leap year");
        }

    }
}
