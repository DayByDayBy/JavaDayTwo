import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> personalCollection;


    public Borrower(String name) {
        this.name = name;
        this.personalCollection = new ArrayList<>();
    }

    public int countBooks() {
        return personalCollection.size();
    }
    public void addBook(Book bible) {
        this.personalCollection.add(bible);
    }

}

