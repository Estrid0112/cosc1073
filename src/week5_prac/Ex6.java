package week5_prac;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] array = new int[20];

        System.out.println(array.length);

        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.print(array[i] + ", ");
        }

    }
}
