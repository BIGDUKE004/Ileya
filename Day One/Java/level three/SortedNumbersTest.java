import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedNumbersTest{

    @Test
        public void testThatArrayIsSorted(){
         int [] [] arr = {
        {3, 5, 1},
        {2, 4, 6},
        };
        int [] actual = {1, 2, 3, 4, 5, 6};
        int [] expected = SortedNumbers.flatten(arr);
        assertArrayEquals(actual, expected);

        }


}
