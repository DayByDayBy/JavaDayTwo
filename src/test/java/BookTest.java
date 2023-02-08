import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Library mitchell;
    private Book bible;
    private Borrower jim;

    @Before
    public void before() {
        mitchell = new Library("mitchell");
        bible = new Book ("bible", "god", "self-help");
        jim = new Borrower("jim");
    }

}

