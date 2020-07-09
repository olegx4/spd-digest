import java.util.HashSet;
import java.util.Set;

public class CharacterSplitter {

    private final Set<Character> evenCharacters = new HashSet<>();
    private final Set<Character> oddCharacters = new HashSet<>();
    private final AsciiCharacters characters = new AsciiCharacters();

    public AsciiCharacters split(String source) {
        for (char c : source.toUpperCase().toCharArray()) {
            if ((int) c % 2 == 0) {
                evenCharacters.add(c);
            } else {
                oddCharacters.add(c);
            }
        }
        return characters.setEvenCharacters(evenCharacters).setOddCharacters(oddCharacters);
    }
}
