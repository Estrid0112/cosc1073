package week2;

public class StringEquality {

    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "world";
        // This is correct
        System.out.println(firstString.equals(secondString));
        // This is wrong
        System.out.println(firstString == secondString);
        System.out.printf("%6s", "world");
    }
}
