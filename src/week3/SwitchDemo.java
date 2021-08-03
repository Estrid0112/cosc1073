package week3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String score = scnr.next();
        switch (score) {
            case "HD":
                System.out.println("Excellent!");
                break;
            case "DI":
                System.out.println("Good job!");
                break;
            case "CR":
                System.out.println("Not bad!");
            case "PA":
                System.out.println("That's OK!");
            case "NN":
                System.out.println("Try harder next time!");
                break;
            default:
                System.out.println("Your input is not a recognized score.");
        }
    }
}

