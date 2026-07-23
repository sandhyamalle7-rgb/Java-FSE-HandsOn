import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise1_Setting_Up_JUnit {

    @Test
    void testJUnitSetup() {

        String message = "JUnit 5 Setup Successful";

        assertEquals(
                "JUnit 5 Setup Successful",
                message
        );

        System.out.println(message);
    }
}