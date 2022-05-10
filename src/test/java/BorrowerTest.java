import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Rachel");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Rachel", borrower.getName());
    }

    @Test
    public void borrowerStartsWithZeroLoans(){
        assertEquals(0, borrower.numberOfBooksOnLoan());
    }
}
