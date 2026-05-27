import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingTest{

    @Test
        public void testThatArrayIsSorted(){
        int [] array =  {5, 0 , 3, 0, 2, 0};
        int [] actual = {5, 3 , 2 , 0, 0 , 0};
        int [] expected = Sort.sortingNumbers(array);
        assertArrayEquals(actual, expected);

        }


}
