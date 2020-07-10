package characternumbercalculator;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DifferenceCalculatorTest {

    private final DifferenceCalculator calculator = new DifferenceCalculator(new SumCalculator());

    @Test
    void whenSumOfEvenAsciiCodesLessThenOdd_returnNegativeValue() {
        final int expected = -1;
        int actual = calculator.calculate(Set.of('B'), Set.of('C'));

        assertEquals(expected, actual);
    }

    @Test
    void whenSumOfEvenAsciiCodesMoreThenOdd_returnPositiveValue() {
        final int expected = 1;
        int actual = calculator.calculate(Set.of('D'), Set.of('C'));

        assertEquals(expected, actual);
    }

    @Test
    void whenFirstSetIsInitializedButEmpty_returnNegativeValue() {
        final int expected = -65;
        int actual = calculator.calculate(Set.of(), Set.of('A'));
        assertEquals(expected, actual);
    }

    @Test
    void whenSecondSetIsInitializedButEmpty_returnPositiveValue() {
        final int expected = 66;
        int actual = calculator.calculate(Set.of('B'), Set.of());
        assertEquals(expected, actual);
    }

    @Test
    void whenBothSetsIsInitializedButEmpty_returnZeroValue() {
        final int expected = 0;
        int actual = calculator.calculate(Set.of(), Set.of());
        assertEquals(expected, actual);
    }

    @Test
    void whenFirstGroupOfCharactersIsNull_throwSetNotInitializedException() {
        assertThrows(SetNotInitializedException.class, () -> calculator.calculate(null, Set.of('A')));
    }

    @Test
    void whenSecondGroupOfCharactersIsNull_throwSetNotInitializedException() {
        assertThrows(SetNotInitializedException.class, () -> calculator.calculate(Set.of('B'), null));
    }
}