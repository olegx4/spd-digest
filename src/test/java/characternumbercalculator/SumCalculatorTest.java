package characternumbercalculator;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {

    final SumCalculator calculator = new SumCalculator();

    @Test
    void whenGroupOfCharactersIsNull_throwSetNotInitializedException() {
        assertThrows(SetNotInitializedException.class, () -> calculator.sumOfCharacterNumber(null));
    }

    @Test
    void whenGroupOfCharactersIsEmpty_returnZeroValue() {
        final int expected = 0;
        final int actual = calculator.sumOfCharacterNumber(Set.of());

        assertEquals(expected, actual);
    }
}