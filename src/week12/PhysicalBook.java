package week12;

public class PhysicalBook extends Book{
    private int numCopies;
    public PhysicalBook(String bookName, Author author, int numCopies){
        super(bookName, author);
        this.numCopies = numCopies;
    }
    public void printInfo(){
        System.out.printf("%-30s%-30s%-30d", getBookName(), getAuthor().getAuthorName(), numCopies);
    }

}
