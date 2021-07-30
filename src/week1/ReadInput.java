package week1;

import java.util.*;

public class ReadInput  {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scnr.next();
        System.out.println("What is your age?");
        int age = scnr.nextInt();
        System.out.println("What is your height in cm?");
        double height = scnr.nextDouble();
        System.out.println("My name is " + name + ". My age is " + age + ". And I am " + height + "cm tall.");
    }
}

