import org.example.SimpleCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

}
