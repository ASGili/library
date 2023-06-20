import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;


    @Before
    public void setUp(){
        borrower = new Borrower();
        book1 = new Book("Dune", "Frank Herbert", "Science Fiction");
        book2 = new Book("Dare","Philip Jose Farmer", "Science Fiction");
        book3 = new Book("The Big Sleep","Raymond Chandler", "Crime");
        ArrayList<Book> collection = new ArrayList<>();
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        library = new Library(collection);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrow(book1);
        assertEquals(1, borrower.getBorrowerCollectionSize());
    }
}
