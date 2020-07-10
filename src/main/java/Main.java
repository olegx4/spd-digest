import characternumbercalculator.DifferenceCalculator;
import characternumbercalculator.SumCalculator;
import characterseparator.AsciiSeparatedCharacters;
import characterseparator.CharacterSeparator;
import setconverter.SetConverter;

public class Main {

    public static void main(String[] args) {
        final String source = "SPD-University";

        final CharacterSeparator characterSeparator = new CharacterSeparator();
        final AsciiSeparatedCharacters characters = characterSeparator.separate(source);

        final SumCalculator sumCalculator = new SumCalculator();
        final DifferenceCalculator calculator = new DifferenceCalculator(sumCalculator);
        final int difference = calculator.calculate(characters.getEvenCharacters(), characters.getOddCharacters());

        final SetConverter setConverter = new SetConverter();
        System.out.println("First group of even Ascii code symbols : " + setConverter.toString(characters.getEvenCharacters()));
        System.out.println("Sum of the first group : " + sumCalculator.sumOfCharacterNumber(characters.getEvenCharacters()));
        System.out.println("Second group of odd Ascii code symbols : " + setConverter.toString(characters.getOddCharacters()));
        System.out.println("Sum of the second group : " + sumCalculator.sumOfCharacterNumber(characters.getOddCharacters()));
        System.out.println("The difference between the sum of unique characters in the first and second groups = " + difference);
    }
}
