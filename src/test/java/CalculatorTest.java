import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void testCalculate_Addition() {
        Addition addition = new AdditionClass();
        double result = addition.calculate(5, -1.5);
        assertEquals(3.5, result);
    }

    @Test
    public void testCalculate_Subtraction() {
        Subtraction subtraction = new SubtractionClass();
        double result = subtraction.calculate(5, -1.5);
        assertEquals(6.5, result); //
    }

    @Test
    public void testCalculate_Multiplication() {
        Multiplication multiplication = new MultiplicationClass();
        double result = multiplication.calculate(-2.7, -2.0);
        assertEquals(5.4, result);
    }

    @Test
    public void testCalculate_Division() {
        Division division = new DivisionClass();
        double result = division.calculate(-18, -2);
        assertEquals(9.0, result); 
    }

    @Test
    public void testCalculate_DivisionByZero() {
        Division division = new DivisionClass();
        assertThrows(ArithmeticException.class, () -> {
            division.calculate(10, 0);
        });
    }
    }
