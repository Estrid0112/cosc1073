package week3;

import java.util.Scanner;

public class VoidFunction {
    public void sayHello(){
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.next();
        System.out.println("Hello, I'm " + studentName + ". And I'm RMIT. I am very excited to be here.");
    }
    public static void main(String[] args) {
        new VoidFunction().sayHello();
        new VoidFunction().sayHello();
        new VoidFunction().sayHello();
    }
}
