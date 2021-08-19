package week4;

import java.util.Scanner;

public class LabelledStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        outer:
        while (true) {
            while (true) {
                System.out.println("Do you wish to exit the inner loop? Y/N");
                if (s.hasNext()) {
                    String answer = s.next();
                    if (answer.equals("Y") || answer.equals("y")){
                        break outer;
                    }
                }
            }
        }

    }
}
