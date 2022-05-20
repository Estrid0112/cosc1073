package week12;

import java.util.Scanner;

public class Section2 {
    public final static int CAPACITY = 100;
    public static void main(String[] args) {
        Author[] authors = new Author[CAPACITY];

        System.out.println("Enter a data point (-1 to stop input):");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            String line = scanner.nextLine();
            if (line.equals("-1")){
                break;
            }
            String[] tokens = line.split(",");

            Author author = new Author(tokens[0], Integer.parseInt(tokens[1]));
            authors[count] = author;
            count ++;
        }

        System.out.println("Enter an author name: ");
        String authorName = scanner.nextLine();
        boolean found = false;
        for (int i = 0;  i<count; i++){
            if (authors[i].getAuthorName().equals(authorName)){
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Index: -1");
        }
    }
}
