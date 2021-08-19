package week3;

import java.util.Scanner;

public class CubeProgram {
    public static int cube(int i) {
        i = i * i * i;
        return i;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int number = scnr.nextInt();
        System.out.println(cube(number));
    }
}

