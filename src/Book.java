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
}
