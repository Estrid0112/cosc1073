package week12;

public class Author {
    private String authorName;
    private int yearOfBirth;

    public Author(String name, int year){
        this.authorName = name;
        this.yearOfBirth = year;
    }

    public String getAuthorName() {
        return authorName;
    }
}
