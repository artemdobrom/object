import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Book book = (Book) a;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }

}
