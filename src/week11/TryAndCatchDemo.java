package week11;

public class TryAndCatchDemo {
    public static void main(String[] args) {
        try {
            // Possible exception 1
            Integer.parseInt("123");

            // Possible exception 2
            int num = -1;
            if (num < 0 || num > 9)
                throw new RangeException("out of range, ");
        }
        catch (NumberFormatException e) {
            System.out.println("Not an integer!");
        }
        catch (RangeException exception){
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("This always runs.");
        }

    }
}
