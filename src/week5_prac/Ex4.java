package week5_prac;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curMax = -1;
        int sum = 0;
        int count = 0;
        while (true) {
            int tmp = scanner.nextInt();
            if (tmp < 0){
                break;
            }
            if (curMax < tmp){
                curMax = tmp;
            }
            sum += tmp;
            count += 1;
        }

        System.out.println(curMax + " " + sum/count);

    }
}
