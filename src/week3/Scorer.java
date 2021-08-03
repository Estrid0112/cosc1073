package week3;

import java.util.Scanner;

public class Scorer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int score = scnr.nextInt();
        if (score >= 80) {
            System.out.println("HD");
        } else if (score >= 70 && score <= 79){
            System.out.println("DI");
        } else if (score >= 60 && score <=69){
            System.out.println("PA");
        }
    }
}

