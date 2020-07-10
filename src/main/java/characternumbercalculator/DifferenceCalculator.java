package characternumbercalculator;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class DifferenceCalculator {

    public int calculate(Set<Character> evenCharacters, Set<Character> oddCharacters) throws SetNotInitializedException {
        SumCalculator sumCalculator = new SumCalculator();
        if (isNull(evenCharacters)) {
            throw new SetNotInitializedException("Set with even characters aro not initialized");
        } else if (isNull(oddCharacters)) {
            throw new SetNotInitializedException("Set with odd characters aro not initialized");
        }
        return sumCalculator.sumOfCharacterNumber(evenCharacters) - sumCalculator.sumOfCharacterNumber(oddCharacters);
    }
}
