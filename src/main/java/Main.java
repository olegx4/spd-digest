public class Main {

    public static void main(String[] args) {
        final String source = "SPD-University";
        final CharacterSeparator characterSeparator = new CharacterSeparator();
        final AsciiSeparatedCharacters characters = characterSeparator.separate(source);

        final DifferenceCalculator calculator = new DifferenceCalculator();
        final int difference = calculator.calculate(characters.getEvenCharacters(), characters.getOddCharacters());

        System.out.println("First group of even Ascii code symbols : " + characters.getEvenCharacters());
        System.out.println("Second group of odd Ascii code symbols : " + characters.getOddCharacters());
        System.out.println("The difference between the sum of unique characters in the first and second groups = " + difference);
    }
}
