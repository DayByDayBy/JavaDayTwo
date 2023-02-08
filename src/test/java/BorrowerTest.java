import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library mitchell;
    private Book bible;
    private Borrower jim;

    @Before
    public void before() {
        mitchell = new Library("mitchell");
        bible = new Book("bible", "god", "self-help");
        jim = new Borrower("jim");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, jim.countBooks());
    }

    @Test
    public void canAddBook(){
        jim.addBook(bible);
        assertEquals(1, jim.countBooks());
    }
}

