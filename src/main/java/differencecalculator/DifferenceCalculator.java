package differencecalculator;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class DifferenceCalculator {

    public int calculate(Set<Character> evenCharacters, Set<Character> oddCharacters) throws SetNotInitializedException {
        if (isNull(evenCharacters)) {
            throw new SetNotInitializedException("Set with even characters aro not initialized");
        } else if (isNull(oddCharacters)) {
            throw new SetNotInitializedException("Set with odd characters aro not initialized");
        }
        return sumOfCharacterNumber(evenCharacters) - sumOfCharacterNumber(oddCharacters);
    }

    private int sumOfCharacterNumber(Set<Character> characters) {
        return characters.stream()
                .mapToInt(Character::charValue)
                .sum();
    }
}
