import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise4_AAA_TestFixtures_Setup_Teardown {


    Calculator calculator;


    // Setup method - runs before every test
    @BeforeEach
    void setUp() {

        calculator = new Calculator();

        System.out.println("Test Setup Completed");
    }


    @Test
    void testAddition() {


        // Arrange
        int firstNumber = 10;
        int secondNumber = 20;


        // Act
        int result = calculator.add(firstNumber, secondNumber);


        // Assert
        assertEquals(30, result);


        System.out.println("Addition Test Passed");
    }


    // Teardown method - runs after every test
    @AfterEach
    void tearDown() {

        calculator = null;

        System.out.println("Test Cleanup Completed");
    }

}


// Supporting class

class Calculator {


    int add(int a, int b) {

        return a + b;
    }
}