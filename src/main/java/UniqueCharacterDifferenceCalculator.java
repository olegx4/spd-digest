import java.util.Set;

public class UniqueCharacterDifferenceCalculator {

    public int calculate(Set<Character> evenCharacters, Set<Character> oddCharacters) {
        return sum(evenCharacters) - sum(oddCharacters);
    }

    private int sum(Set<Character> characters) {
        return characters.stream()
                .mapToInt(Character::charValue)
                .sum();
    }
}
