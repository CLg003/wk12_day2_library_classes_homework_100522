import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> bookCountByGenre(){
        HashMap<String, Integer> genreBookCount = new HashMap<>();
        for (Book book : this.bookStock) {
            String genre = book.getGenre();
            if (genreBookCount.keySet().contains(genre)) {
                genreBookCount.put(genre, genreBookCount.get(genre) + 1);
            } else {
                genreBookCount.put(genre, 1);
            }
        }
        return genreBookCount;
    }
}
