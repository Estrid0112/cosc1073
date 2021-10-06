package week11;

public class UncaughtExceptionTest {
    private static void numberTest (int num)
            throws RangeException {
        if (num < 0 || num > 9)
            throw new RangeException("Number out of Range");
        else
            System.out.println("A valid number was entered");
    }
    public static void main(String args[]) throws RangeException{
        numberTest(5);
        numberTest(12);
        numberTest(0);
        numberTest(-1);
    }
}
