package first;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ObjectArrayArguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class FactorialTest {

    @Test
    void whenComputeNegativeThenThrowArithmeticException() {
        assertThrows(IllegalArgumentException.class, () -> first.Factorial.compute(-1));
    }

    @ParameterizedTest
    @MethodSource(names = "doubleIntsProvider")
    void whenComputeOfInputThenResult(int input, int result) {
        assertEquals(Factorial.compute(input), result);
    }

    static Stream<Arguments> doubleIntsProvider() {
        return Stream.of(ObjectArrayArguments.create(0, 1),
                ObjectArrayArguments.create(1, 1),
                ObjectArrayArguments.create(3, 6));
    }
}