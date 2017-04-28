package first;

import org.junit.jupiter.api.Test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
class FactorialTest {

    @Test
    void whenComputeNegativeThenThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> Factorial.compute(-1));
    }

    @Test
    void whenComputeZeroThenOne() {
        assertEquals(Factorial.compute(0), 1);
    }

    @Test
    void whenComputeOneThenOne() {
        assertEquals(Factorial.compute(1), 1);
    }

    @Test
    void whenComputeFiveThenNinetySix() {
        assertEquals(Factorial.compute(5), 120);
    }


}