import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGradingSystemTest{

    @Test
        public void testThatWeCollectInputFromUserAndStoreIt(){
        int [] [] storage = {
        {2, 2},
        {2 , 2}
        };
        int[][] actual = StudentGradingSystem.collectStudentScores(2, 2);
        int [][]expected = storage;
        assertArrayEquals(actual, expected);
        }

}
