import java.util.Objects;

public class Book {
    private final String title;
    private int publishData;
    private final Author author;


    public Book(String title, int publishData, Author author) {
        this.title = title;
        this.publishData = publishData;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishData() {
        return publishData;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishData(int publishData) {
        this.publishData = publishData;
    }

    @Override
    public String toString() {
        return title + publishData +
                author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishData == book.publishData && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishData, author);
    }
}
