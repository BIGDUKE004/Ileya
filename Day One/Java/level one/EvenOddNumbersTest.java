
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvenOddNumbersTest{

    @Test
        public void testThatArrayIsSorted(){
        int [] array = {45, 60, 3, 10, 9, 22};
        int []  actual = {{45, 3 , 9}, {60 , 10, 22}};
        int [] expected = EvenOddNumbers.sortingNumbers(array);
        assertArrayEquals(actual, expected);

        }


}
