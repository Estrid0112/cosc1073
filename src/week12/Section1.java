package week12;

import java.util.Scanner;

public class Section1 {
    final static int CAPACITY = 100;
    public static void main(String[] args) {
        String[] myStrings = new String[CAPACITY];
        int[] myIntegers = new int[CAPACITY];


        System.out.println("Enter a data point (-1 to stop input):");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            String line = scanner.nextLine();
            if (line.equals("-1")){
                break;
            }
            String[] tokens = line.split(",");
            myStrings[count] = tokens[0];
            myIntegers[count] = Integer.parseInt(tokens[1]);

            count ++;
        }

        for(int i = 0; i < count; i++){
            System.out.printf("%-20s|%23d\n", myStrings[i], myIntegers[i]);
        }
    }

}
