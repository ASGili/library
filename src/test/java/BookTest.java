import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp(){
       book1 = new Book("Dune", "Frank Herbert", "Science Fiction");
       book2 = new Book("Dare","Philip Jose Farmer", "Science Fiction");
       book3 = new Book("The Big Sleep","Raymond Chandler", "Crime");
    }

    @Test
    public void hasTitle(){
        assertEquals("Dune", book1.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("Frank Herbert", book1.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Crime", book3.getGenre());
    }
}
