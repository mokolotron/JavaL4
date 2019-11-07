import java.util.Objects;
import java.util.Scanner;
public class Book {

    private String author;
    private String title;

    public Book() {
        this.author = "";
        this.title = "";
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
    /** fill obj's atributs */
    public void fill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input author");
        String author = sc.nextLine();
        this.author = author.substring(0, 1).toUpperCase() + author.substring(1);
        System.out.println("Input title");
        String title = sc.nextLine();
        this.title = title.substring(0, 1).toUpperCase() + title.substring(1);
    }

}
