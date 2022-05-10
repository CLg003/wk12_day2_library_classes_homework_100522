import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;
    private Book book8;
    private Book book9;
    private Book book10;
    private Book book11;

    @Before
    public void before(){
        library = new Library(10);
        book1 = new Book("Far From the Madding Crowd", "Thomas Hardy", "Classic");
        book2 = new Book("The Shining", "Stephen King", "Horror");
        book3 = new Book("Summer", "Edith Wharton", "Classic");
        book4 = new Book("The Haunting of Hill House", "Shirley Jackson", "Horror");
        book5 = new Book("A Thousand Splendid Suns", "Khaled Hosseini", "General Fiction");
        book6 = new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adichie", "General Fiction");
        book7 = new Book("Brave New World", "Aldous Huxley", "Sci-Fi");
        book8 = new Book("Ender's Game", "Orson Scott Card", "Sci-Fi");
        book9 = new Book("The Girl With the Louding Voice", "Abi Dare", "General Fiction");
        book10 = new Book("Rebecca", "Daphne du Maurier", "Classic");
        book11 = new Book("The Notebook", "Nicholas Sparks", "Romance");
    }

    @Test
    public void bookStockStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookToStockIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        assertEquals(10, library.bookCount());
    }

}
