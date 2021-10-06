package week11;

public class ForwardExceptionTest {
    private static void numberTest (int num)
            throws RangeException {
        if (num < 0 || num > 9)
            throw new RangeException("Number out of Range");
        else
            System.out.println("A valid number was entered");
    }
    public static void main(String args[]) {
        try {
            numberTest(5);
            numberTest(12);
            numberTest(0);
            numberTest(-1);
        }
        catch (RangeException rangeException) {
            System.err.println(rangeException.getMessage());
        }
        finally {
            System.out.println("Do this whatever happens");
        }
    }
}
