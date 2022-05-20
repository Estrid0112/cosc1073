package week12;

public abstract class Book {
    private String bookName;
    private Author author;

    public Book(String bookName, Author author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public abstract void printInfo();
}
