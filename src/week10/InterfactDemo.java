package week10;

public class InterfactDemo {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Rectangle(1.0, 2.0);
        printables[1] = new Triangle(2.0, 3.0);
        printables[2] = new SavingsAccount("001", "Estrid", 1000);

        for(int i = 0; i<3; i++){
            printables[i].drawShape();
        }
    }
}
