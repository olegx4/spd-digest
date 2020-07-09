package characterseparator;

import java.util.HashSet;
import java.util.Set;

public class AsciiSeparatedCharacters {

    private final Set<Character> evenCharacters = new HashSet<>();
    private final Set<Character> oddCharacters = new HashSet<>();

    public Set<Character> getEvenCharacters() {
        return evenCharacters;
    }

    public Set<Character> getOddCharacters() {
        return oddCharacters;
    }

    public void addEven(char c) {
        this.evenCharacters.add(c);
    }

    public void addOdd(char c) {
        this.oddCharacters.add(c);
    }
}
