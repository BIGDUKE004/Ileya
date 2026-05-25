import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NonPerfectSquareTest{

    @Test
        public void testThatTheresNonPerfectSquare(){
        int [] array =  {4, 7, 9, 10, 49, 6};
        int [] actual = {4, -1, 9, -1, 49 , -1};
        int [] expected = NonPerfectSquare.nonPerfectSquare(array);
        assertArrayEquals(actual, expected);

        }


}
