import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(ArrayList<Book> collection){
        this.collection = collection;
        this.capacity = 4;
    }

    public int getCollectionSize(){
        return collection.size();
    }
    public int getCapacity(){
        return capacity;
    }
    public void addBook(Book book){
        if(capacity > getCollectionSize()){
            collection.add(book);
        }
    }
    public void lendBook(Book book){
        int foundIndex = collection.indexOf(book);
        collection.remove(foundIndex);
    }
}
