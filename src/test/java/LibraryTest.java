import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void setUp(){
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
    public void hasCollection(){
        assertEquals(3, library.getCollectionSize());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBook(){
        Book book4 = new Book("Maigret At The Crossroads","George Simenon","Crime");
        library.addBook(book4);
        assertEquals(4,library.getCollectionSize());
    }
    @Test
    public void cantAddBookDueToCapacity(){
        Book book4 = new Book("Maigret At The Crossroads","George Simenon","Crime");
        Book book5 = new Book("Consider Phlebas","Iain Banks","Science Fiction");
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4,library.getCollectionSize());
    }

    @Test
    public void canLendBook(){
        library.lendBook(book1);
        assertEquals(2,library.getCollectionSize());
    }
}
