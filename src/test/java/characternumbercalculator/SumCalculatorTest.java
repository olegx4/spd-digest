package characternumbercalculator;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {

    @Test
    void whenGroupOfCharactersIsNull_throwSetNotInitializedException() {
        final SumCalculator calculator = new SumCalculator();

        assertThrows(SetNotInitializedException.class, () -> calculator.sumOfCharacterNumber(null));
    }
}