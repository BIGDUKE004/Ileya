import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PerfectSquareTest{

    @Test
        public void testThatTheresPerfectSquare(){
        int [] array =  {4, 7, 9, 10, 16, 18};
        int [] actual = {4, 9, 16};
        int [] expected = PerfectSquare.perfectSquare(array);
        assertArrayEquals(actual, expected);

        }


}
