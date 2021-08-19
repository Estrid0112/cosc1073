package week5;

public class TwoDArray {
    public static void main(String[] args) {
        double[][] array = new double[10][100];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = 1.0;
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
