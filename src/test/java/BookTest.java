import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Moon Palace","Paul Auster","Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Moon Palace", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Paul Auster", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fiction", book.getGenre());
    }

}

