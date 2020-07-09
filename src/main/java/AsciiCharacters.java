import java.util.HashSet;
import java.util.Set;

public class AsciiCharacters {

    private Set<Character> evenCharacters = new HashSet<>();
    private Set<Character> oddCharacters = new HashSet<>();

    public Set<Character> getEvenCharacters() {
        return evenCharacters;
    }

    public AsciiCharacters setEvenCharacters(Set<Character> evenCharacters) {
        this.evenCharacters = evenCharacters;
        return this;
    }

    public Set<Character> getOddCharacters() {
        return oddCharacters;
    }

    public AsciiCharacters setOddCharacters(Set<Character> oddCharacters) {
        this.oddCharacters = oddCharacters;
        return this;
    }
}
