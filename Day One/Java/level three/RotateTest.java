import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateTest{

    @Test
        public void testThatTheRotationWorks(){
       int [] array = {1, -9, 3, 0, 8};
       int [] actual = Rotate.rotate(array);
       int [] expected =  {-9, 3, 0, 8, 1};
        assertArrayEquals(actual, expected);
        }






}
