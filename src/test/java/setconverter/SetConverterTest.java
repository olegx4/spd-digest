package setconverter;

import exception.SetNotInitializedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SetConverterTest {
    @Test
    void whenSetIsNull_throwSetNotInitializedException() {
        final SetConverter setConverter = new SetConverter();

        assertThrows(SetNotInitializedException.class, () -> setConverter.toString(null));
    }
}