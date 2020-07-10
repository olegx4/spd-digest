package characternumbercalculator;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DifferenceCalculatorTest {

    private final DifferenceCalculator calculator = new DifferenceCalculator();

    @Test
    void whenSumOfEvenAsciiCodesLessThenOdd_returnNegativeValue() throws SetNotInitializedException {
        final int expected = -1;
        int actual = calculator.calculate(Set.of('B'), Set.of('C'));

        assertEquals(expected, actual);
    }

    @Test
    void whenSumOfEvenAsciiCodesMoreThenOdd_returnPositiveValue() throws SetNotInitializedException {
        final int expected = 1;
        int actual = calculator.calculate(Set.of('D'), Set.of('C'));

        assertEquals(expected, actual);
    }

    @Test
    void whenFirstSetIsInitializedButEmpty_returnNegativeValue() throws SetNotInitializedException {
        final int expected = -65;
        int actual = calculator.calculate(Set.of(), Set.of('A'));
        assertEquals(expected, actual);
    }

    @Test
    void whenSecondSetIsInitializedButEmpty_returnPositiveValue() throws SetNotInitializedException {
        final int expected = 66;
        int actual = calculator.calculate(Set.of('B'), Set.of());
        assertEquals(expected, actual);
    }

    @Test
    void whenBothSetsIsInitializedButEmpty_returnZeroValue() throws SetNotInitializedException {
        final int expected = 0;
        int actual = calculator.calculate(Set.of(), Set.of());
        assertEquals(expected, actual);
    }

    @Test
    void whenFirstGroupOfCharactersIsNull_throwException() {
        assertThrows(SetNotInitializedException.class, () -> calculator.calculate(null, Set.of('A')));
    }

    @Test
    void whenSecondGroupOfCharactersIsNull_throwException() {
        assertThrows(SetNotInitializedException.class, () -> calculator.calculate(Set.of('B'), null));
    }
}