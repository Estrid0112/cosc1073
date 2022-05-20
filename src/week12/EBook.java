package week12;

public class EBook extends Book{
    public EBook(String bookName, Author author){
        super(bookName, author);
    }

    public void printInfo(){
        System.out.printf("%-30s%-30s%-30s", getBookName(), getAuthor().getAuthorName(), "Unlimited");
    }

}
