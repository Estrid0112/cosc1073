package week12;

import java.util.Scanner;

public class Section3 {
    final static int CAPACITY = 100;
    public static void main(String[] args) {
        System.out.println("Enter a book (-1 to stop):");
        Scanner scanner = new Scanner(System.in);
        Book[] myBooks = new Book[CAPACITY];
        int count = 0;
        while(true){
            String line = scanner.nextLine();
            if (line.equals("-1")){
                break;
            }
            String[] tokens = line.split(",");
            if (tokens[0].equals("Physical book")){
                Author author = new Author(tokens[3], Integer.parseInt(tokens[4]));
                PhysicalBook book = new PhysicalBook(tokens[1], author, Integer.parseInt(tokens[2]));
                myBooks[count] = book;
            }else if (tokens[0].equals("Ebook")){
                Author author = new Author(tokens[2], Integer.parseInt(tokens[3]));
                EBook book = new EBook(tokens[1], author);
                myBooks[count] = book;
            }
            count ++;
        }


        for (int i = 0; i < count; i++){
            myBooks[i].printInfo();
            System.out.println();
        }
    }

}
