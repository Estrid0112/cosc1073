package week11;

public class LoopAndExceptionTest {
    private static void numberTest (int num) {
        boolean valid;
        try {
            if (num < 0 || num > 9)
                throw new RangeException("out of range\n");
            else
                valid = true;
        }
        catch (RangeException e) {
            System.out.print(e.getMessage());
            valid = false;
        }
        if (valid)
            System.out.print(", valid data\n");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            numberTest(i);
        }
    }
}
