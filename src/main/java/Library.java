import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library() {
        this.collection = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity) {
        this.collection.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

}
