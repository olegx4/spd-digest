public class Main {

    public static void main(String[] args) {
        final String source = "SPD-University";
        final CharacterSplitter characterSplitter = new CharacterSplitter();
        final AsciiCharacters characters = characterSplitter.split(source);

        final UniqueCharacterDifferenceCalculator calculator = new UniqueCharacterDifferenceCalculator();
        final int difference = calculator.calculate(characters.getEvenCharacters(), characters.getOddCharacters());

        System.out.println("First group of even Ascii code symbols : " + characters.getEvenCharacters());
        System.out.println("Second group of odd Ascii code symbols : " + characters.getOddCharacters());
        System.out.println("The difference between the sum of the first and second  groups = " + difference);
    }
}
