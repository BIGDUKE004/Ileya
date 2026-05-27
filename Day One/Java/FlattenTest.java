import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlattenTest{

    @Test
        public void testThatArrayIsFlatten(){
        int [] [] arr = {
        {9, 0, 7},
        {3, 5, 1},
        {8, 1, 7},
        {9, 9, 6},
        };
        int [] actual = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
        int [] expected = Flatten.flatten(arr);
        assertArrayEquals(actual, expected);

        }


}
