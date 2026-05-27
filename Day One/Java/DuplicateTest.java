
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateTest{

    @Test
        public void testThatArrayIsSorted(){
        int [] array = {1, 2, 3, 2, 4, 3};
        int [] actual = {2, 3, 0, 0, 0, 0};
        int [] expected = Duplicate.removingDuplicate(array);
        assertArrayEquals(actual, expected);

        }


}
