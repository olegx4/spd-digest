package characternumbercalculator;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class DifferenceCalculator {

    private final SumCalculator sumCalculator;

    public DifferenceCalculator(SumCalculator sumCalculator) {
        this.sumCalculator = sumCalculator;
    }

    public int calculate(Set<Character> evenCharacters, Set<Character> oddCharacters) {
        if (isNull(evenCharacters)) {
            throw new SetNotInitializedException("Set with even characters are not initialized");
        } else if (isNull(oddCharacters)) {
            throw new SetNotInitializedException("Set with odd characters are not initialized");
        }
        return sumCalculator.sumOfCharacterNumber(evenCharacters) - sumCalculator.sumOfCharacterNumber(oddCharacters);
    }
}
