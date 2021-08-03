package week3;

import java.util.Scanner;

public class MathOps {
    public static int Max(int x, int y) {
        if (x > y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        System.out.println(Max(a, b));
    }
}

