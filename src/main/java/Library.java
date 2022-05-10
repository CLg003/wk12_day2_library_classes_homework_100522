import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookStock;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookStock = new ArrayList<>();
    }

    public int bookCount(){
        return bookStock.size();
    }

    public void addBook(Book book){
        bookStock.add(book);
    }
}
