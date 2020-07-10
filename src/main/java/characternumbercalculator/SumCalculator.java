package characternumbercalculator;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class SumCalculator {

    public int sumOfCharacterNumber(Set<Character> characters) throws SetNotInitializedException {
        if (isNull(characters)) {
            throw new SetNotInitializedException("Cannot sum not initialized set of characters");
        }
        return characters.stream()
                .mapToInt(Character::charValue)
                .sum();
    }
}
