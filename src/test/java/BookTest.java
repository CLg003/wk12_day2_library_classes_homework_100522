import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Far From the Madding Crowd", "Thomas Hardy", "Classic");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Far From the Madding Crowd", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Thomas Hardy", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Classic", book.getGenre());
    }
}
