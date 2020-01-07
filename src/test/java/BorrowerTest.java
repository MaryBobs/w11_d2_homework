import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library();
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void borrowerBagStartsEmpty() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.countBooks());
        assertEquals(1, library.countBooks());
    }
}


