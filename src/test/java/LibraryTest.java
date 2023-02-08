import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library mitchell;
    private Book bible;
    private Book torah;
    private Book principia;
    private Borrower jim;

    @Before
    public void before() {
        mitchell = new Library("mitchell");
        torah = new Book("bible", "god", "self-help");
        bible = new Book("torah", "god", "self-help");
        principia = new Book("Philosophiæ Naturalis Principia Mathematica", "newton", "maths");
        jim = new Borrower("jim");
        }

    @Test
    public void canCountBooks(){
        assertEquals(0, mitchell.countBooks());
    }

    @Test
    public void canAddBook(){
        mitchell.addBook(bible);
        assertEquals(1, mitchell.countBooks());
    }

    @Test
    public void canCountByGenre(){
        mitchell.addBook(bible);
        mitchell.addBook(torah);
        mitchell.addBook(principia);
        assertEquals(2, mitchell.countByGenre("self-help"));

    }

}

