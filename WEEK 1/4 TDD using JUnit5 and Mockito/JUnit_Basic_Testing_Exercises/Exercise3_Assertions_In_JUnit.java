import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise3_Assertions_In_JUnit {

    @Test
    void testAssertions() {

        int number1 = 10;
        int number2 = 20;

        // Checking equality
        assertEquals(30, number1 + number2);


        // Checking true condition
        assertTrue(number1 < number2);


        // Checking false condition
        assertFalse(number1 > number2);


        // Checking object is not null
        String language = "Java";

        assertNotNull(language);


        System.out.println("All assertions passed");
    }
}