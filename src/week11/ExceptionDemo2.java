package week11;

class ExceptionDemo2 extends Throwable {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println( a/b );
    }
}
