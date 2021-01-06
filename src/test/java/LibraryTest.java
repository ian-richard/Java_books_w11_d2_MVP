import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        library = new Library(3);
        book = new Book("Sun", "T.Smithy", "Thriller");
        book1 = new Book("Rain", "J.Rowling", "Drama");
        book2 = new Book("Snow", "L.DaCat", "Romance");
        book3 = new Book("Storm", "D.Dog", "Fetching");
    }

    @Test
    public void addBookToBooks(){
        library.add(book);
        assertEquals(1, library.librarySize());};

    @Test
    public void countBooks(){
        library.add(book);
        library.add(book1);
        library.add(book2);
        assertEquals(3, library.librarySize());};

    @Test
    public void cantAddFourBooks(){
        library.add(book);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.librarySize());}


}
