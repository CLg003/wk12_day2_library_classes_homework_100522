import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Rachel");
        book = new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adichie", "General Fiction");
        library = new Library(10);
        library.addBook(book);

    }

    @Test
    public void borrowerHasName(){
        assertEquals("Rachel", borrower.getName());
    }

    @Test
    public void borrowerStartsWithZeroLoans(){
        assertEquals(0, borrower.numberOfBooksOnLoan());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book, library);
        assertEquals(1, borrower.numberOfBooksOnLoan());
    }
}
