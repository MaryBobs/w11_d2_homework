import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bag;

    public Borrower() {
        this.bag = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.bag.size();
    }
}
