package characterseparator;

import exception.SetNotInitializedException;
import exception.SourceNotInitializedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharacterSeparatorTest {

    private final CharacterSeparator characterSeparator = new CharacterSeparator();

    @Test
    void whenSourceIsEmpty_returnEmptyAsciiSeparatedCharactersSets() throws SourceNotInitializedException {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        final AsciiSeparatedCharacters actual = characterSeparator.separate("");

        assertEquals(expected, actual);
    }

    @Test
    void whenSourceAsciiCharactersAreEven_returnEvenAsciiSeparatedCharacters() throws SourceNotInitializedException {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addEven('B');
        expected.addEven('D');
        final AsciiSeparatedCharacters actual = characterSeparator.separate("db");

        assertEquals(expected, actual);
        assertEquals(expected.getEvenCharacters(), actual.getEvenCharacters());
    }

    @Test
    void whenSourceAsciiCharactersAreOdd_returnEvenAsciiSeparatedCharacters() throws SourceNotInitializedException {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addOdd('A');
        expected.addOdd('C');
        final AsciiSeparatedCharacters actual = characterSeparator.separate("AC");

        assertEquals(expected, actual);
        assertEquals(expected.getOddCharacters(), actual.getOddCharacters());
    }

    @Test
    void whenSourceCharactersAreNotUnique_returnUniqueSeparatedCharacters() throws SourceNotInitializedException {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addOdd('A');
        expected.addOdd('C');
        expected.addEven('B');
        expected.addEven('D');
        final AsciiSeparatedCharacters actual = characterSeparator.separate("AAACCCCBBBDD");

        assertEquals(expected, actual);
        assertEquals(expected.getOddCharacters(), actual.getOddCharacters());
        assertEquals(expected.getEvenCharacters(), actual.getEvenCharacters());
    }

    @Test
    void whenSourceCharactersAreInLowerCase_returnSetsWithUpperCaseCharacters() throws SourceNotInitializedException {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addOdd('A');
        expected.addOdd('C');
        expected.addEven('B');
        expected.addEven('D');
        final AsciiSeparatedCharacters actual = characterSeparator.separate("aaabbbddccc");

        assertEquals(expected, actual);
        assertEquals(expected.getOddCharacters(), actual.getOddCharacters());
        assertEquals(expected.getEvenCharacters(), actual.getEvenCharacters());
    }

    @Test
    void whenSourceStringIsNull() {
        assertThrows(SourceNotInitializedException.class, () -> characterSeparator.separate(null));
    }
}