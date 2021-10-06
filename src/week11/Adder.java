package week11;

public class Adder {
    public static void main (String[] args) {
        int n1 = UserReader.getInt("Enter a number: ");
        int n2 = UserReader.getInt("Enter another number: ");
        System.out.println ("The sum is " + (n1+n2));
    }
}
