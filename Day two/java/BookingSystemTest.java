import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BookingSystemTest{

    @Test
        public void testThatFunctionAddBooksFromUserWorks(){
        String [] books = new String[3];
        String [] actual =BookingSystem. addBooksFromUser(books);
        String []expected = {"wale", "tomisi", "miracle"};
        assertArrayEquals(actual, expected);
        }

    @Test
        public void testThatFunctionUserCanRemoveBooksWorks(){
        String [] books = {"wale", "tomisi", "miracle"};
        String [] actual =BookingSystem. userCanRemoveBooks(books);
        String []expected = { null, "tomisi", "miracle"};
        assertArrayEquals(actual, expected);
        }

    @Test
        public void testThatFunctionUserCanUpdateBookWorks(){
        String [] books = {"wale", "tomisi", "miracle"};
        String [] actual =BookingSystem. userCanUpdateBook(books);
        String []expected = { "chef", "tomisi", "miracle"};
        assertArrayEquals(actual, expected);
        }

    @Test
        public void testThatFunctionShowAllBookWorks(){
        String [] books = {"wale", "tomisi", "miracle"};
        String [] actual =BookingSystem. showAllBooks(books);
        String []expected = { "wale", "tomisi", "miracle"};
        assertArrayEquals(actual, expected);
        }

}
