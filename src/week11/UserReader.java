package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserReader {
    public static int getInt(String prompt) {
        BufferedReader stdin = new BufferedReader
                (new InputStreamReader(System.in));
        int number = 0;
        boolean valid = false;
        while (! valid) {
            System.out.print (prompt);
            try {
                number = Integer.parseInt (stdin.readLine());
                valid = true;
            }
            catch (NumberFormatException exception) {
                System.out.println("Invalid input." +
                        "Try again.");
            }
            catch (IOException exception) {
                System.out.println ("Input problem." +
                        "Terminating.");
                System.exit(0);
            }
        }// end while loop
        return number;
    }
}