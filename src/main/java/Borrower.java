import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getBorrowerCollectionSize(){
        return collection.size();
    }
    public void borrow(Book book, Library library){
            collection.add(book);
            library.lendBook(book);
    }
}
