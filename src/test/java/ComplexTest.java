package test.java;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void testMinus() {
        Complex complex1 = new Complex(5, 3);
        Complex complex2 = new Complex(2, 1);

        Complex expected = new Complex(3, 2);

        Complex result = complex1.minus(complex2);

        assertEquals(
                expected.toString(),
                result.toString(),
                "Ожидаемый результат: 3 + 2i, настоящий: " + result.toString()
        );
    }

}



