package week5_prac;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.nextLine();
        for (int i = 0; i < myString.length(); i++){
            char myChar = myString.charAt(i);
            if (Character.isLetter(myChar)){
                System.out.print(myChar);
            }
        }
    }
}
