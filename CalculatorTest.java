import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        calculator calculator = new calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}