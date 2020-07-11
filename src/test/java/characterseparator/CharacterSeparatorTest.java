package characterseparator;

import exception.SourceNotInitializedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharacterSeparatorTest {

    private final CharacterSeparator characterSeparator = new CharacterSeparator();

    @Test
    void whenSourceIsEmpty_returnEmptyAsciiSeparatedCharactersSets() {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        final AsciiSeparatedCharacters actual = characterSeparator.separate("");

        assertEquals(expected, actual);
    }

    @Test
    void whenSourceAsciiCharactersAreEven_returnEvenAsciiSeparatedCharacters() {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addEven('B');
        expected.addEven('D');

        final AsciiSeparatedCharacters actual = characterSeparator.separate("db");

        assertEquals(expected, actual);
        assertEquals(expected.getEvenCharacters(), actual.getEvenCharacters());
    }

    @Test
    void whenSourceAsciiCharactersAreOdd_returnEvenAsciiSeparatedCharacters() {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addOdd('A');
        expected.addOdd('C');

        final AsciiSeparatedCharacters actual = characterSeparator.separate("AC");

        assertEquals(expected, actual);
        assertEquals(expected.getOddCharacters(), actual.getOddCharacters());
    }

    @Test
    void whenSourceCharactersAreNotUnique_returnUniqueSeparatedCharacters() {
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
    void whenSourceCharactersAreInLowerCase_returnSetsWithUpperCaseCharacters() {
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
    void whenSourceStringIsNull_throwSourceNotInitializedException() {
        assertThrows(SourceNotInitializedException.class, () -> characterSeparator.separate(null));
    }

    @Test
    void whenSourceStringHasOddCharacter_returnAsciiSeparatedCharacterObjectWithNotEmptyOddSet() {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addOdd('A');

        final AsciiSeparatedCharacters actual = characterSeparator.separate("a");

        assertEquals(expected.getOddCharacters(), actual.getOddCharacters());
    }

    @Test
    void whenSourceStringHasEvenCharacter_returnAsciiSeparatedCharacterObjectWithNotEmptyEvenSet() {
        final AsciiSeparatedCharacters expected = new AsciiSeparatedCharacters();
        expected.addEven('B');

        final AsciiSeparatedCharacters actual = characterSeparator.separate("b");

        assertEquals(expected.getEvenCharacters(), actual.getEvenCharacters());
    }
}