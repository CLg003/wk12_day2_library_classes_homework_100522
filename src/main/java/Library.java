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
        if (bookStock.size() < capacity) {
            bookStock.add(book);
        } else {
            System.out.println("Library stock is full, no space for new books.");
        }
    }

    public void removeBook(Book book){
        int index = bookStock.indexOf(book);
        bookStock.remove(index);
    }
}
