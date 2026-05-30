import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest{

    @Test
        public void testThatWeGetCardName(){
    long usernumber = 4535725329375632L;
    String actual = CreditCardValidator.cardType(usernumber);
    String expected = "Visa Card";
    assertEquals(actual, expected);
    }

    @Test
        public void testThatWeGetCardNumber(){
    long usernumber = 4535725329375632L;
    long actual = CreditCardValidator.cardNumber(usernumber);
    long expected = usernumber;
    assertEquals(actual, expected);
    }

    @Test
        public void testThatWeGetCardLength(){
    long usernumber = 4535725329375632L;
    int actual = CreditCardValidator.cardLength(usernumber);
    int expected = 16;
    assertEquals(actual, expected);
    }

    @Test
        public void testThatWeGetCardValidation(){
    long usernumber = 4535725329375632L;
    String actual = CreditCardValidator.cardValidation(usernumber);
    String expected = "invalid";
    assertEquals(actual, expected);
    }
}
