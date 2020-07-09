package differencecalculator;

import java.util.Set;

public class DifferenceCalculator {

    public int calculate(Set<Character> evenCharacters, Set<Character> oddCharacters) {
        return sumOfCharacterNumber(evenCharacters) - sumOfCharacterNumber(oddCharacters);
    }

    private int sumOfCharacterNumber(Set<Character> characters) {
        return characters.stream()
                .mapToInt(Character::charValue)
                .sum();
    }
}
