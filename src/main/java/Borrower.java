import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> loans;

    public Borrower(String name){
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int numberOfBooksOnLoan(){
        return loans.size();
    }

}
