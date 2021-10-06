package week11;

public class LocalExceptionTest {
    private static void numberTest (int num) {
        boolean valid;
        try {
            if (num < 0 || num > 9)
                throw new RangeException("out of range, ");
            else
                valid = true;
        }
        catch (RangeException e) {
            System.err.print(e.getMessage());
            valid = false;
        }
        finally {
            System.out.print("always do this");
        }
        if (valid)
            System.out.print(", valid data");
    }

    public static void main(String[] args) {
        numberTest(-1);
    }
}
