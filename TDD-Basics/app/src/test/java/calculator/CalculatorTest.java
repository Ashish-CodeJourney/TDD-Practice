package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(20,5);
        assertEquals(15, result, "20 - 5 should equal 15");
    }
}
