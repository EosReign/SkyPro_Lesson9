public class Book {
    private Author fullName;
    private int publicationYear;
    private String bookName;
    public Book(String bookName, Author fullName, int publicationYear) {
        this.fullName = fullName;
        this.publicationYear = publicationYear;
        this.bookName = bookName;

    }
    public String getFullName() {
        return this.fullName.toString();
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
