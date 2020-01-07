import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bag;

    public Borrower() {
        this.bag = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.bag.size();
    }

    public void addBook(Book book) {
        this.bag.add(book);
    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.bag.add(book);
    }
}
