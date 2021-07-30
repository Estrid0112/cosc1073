package week2;

public class CompareDouble {
    public static void main(String[] args) {
        double p1 = 1.0;
        double p2 = 1.0 + 1e-6;
        // The below is not correct
        System.out.println(p1 == p2);
        // This is correct
        System.out.println(Math.abs(p1 - p2) < 1e-5);
    }
}
