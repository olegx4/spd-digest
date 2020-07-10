package setconverter;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SetConverterTest {

    final SetConverter setConverter = new SetConverter();

    @Test
    void whenSetIsNull_throwSetNotInitializedException() {
        assertThrows(SetNotInitializedException.class, () -> setConverter.toString(null));
    }

    @Test
    void whenSetIsEmpty_returnEmptyString() {
        final String expected = "";
        final String actual = setConverter.toString(Set.of());

        assertEquals(expected, actual);
    }

    @Test
    void whenSetIsNotEmpty_returnNextString() {
        final String expected = "'A'=65";
        final String actual = setConverter.toString(Set.of('A'));

        assertEquals(expected, actual);
    }

    @Test
    void whenSetHasTwoElements_returnNextString() {
        final String firstExpected = "'A'=65, 'C'=67";
        final String secondExpected = "'C'=67, 'A'=65";
        final String actual = setConverter.toString(Set.of('A', 'C'));

        assertThat(actual, anyOf(is(firstExpected), is(secondExpected)));
    }
}