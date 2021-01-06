import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int librarySize() { return this.books.size();}

//    public void add(Book book) {this.books.add(book);}
    public void add(Book book) {
        if (this.librarySize() < this.capacity) {
            this.books.add(book);
        }}
}

