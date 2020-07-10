package characterseparator;

import exception.SourceNotInitializedException;

import static java.util.Objects.isNull;

public class CharacterSeparator {

    public AsciiSeparatedCharacters separate(String source) throws SourceNotInitializedException {
        if (isNull(source)) {
            throw new SourceNotInitializedException("Source string is not initialised");
        }
        final AsciiSeparatedCharacters characters = new AsciiSeparatedCharacters();
        for (char c : source.toUpperCase().toCharArray()) {
            if ((int) c % 2 == 0) {
                characters.addEven(c);
            } else {
                characters.addOdd(c);
            }
        }
        return characters;
    }
}
