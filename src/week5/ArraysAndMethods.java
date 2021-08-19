package week5;

public class ArraysAndMethods {
    public static void arrayIncrement(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] += 1;
        }
    }

    public static void primitiveIncrement(int a){
        a += 1;
    }

    public static void main(String[] args){
        int[] zeros = new int[10];
        for (int i = 0; i < zeros.length; i++){
            System.out.print(zeros[i] + " ");
        }
        System.out.print("\n");
        arrayIncrement(zeros);
        for (int i = 0; i < zeros.length; i++){
            System.out.print(zeros[i] + " ");
        }
        System.out.print("\n");

        int x = 0;
        System.out.println(x);
        primitiveIncrement(x);
        System.out.println(x);


    }

}
