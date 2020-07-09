public class CharacterSeparator {

    private final AsciiSeparatedCharacters characters = new AsciiSeparatedCharacters();

    public AsciiSeparatedCharacters separate(String source) {
        for (char c : source.toUpperCase().toCharArray()) {
            if ((int) c % 2 == 0) {
                characters.addEven(c);
            } else {
                characters.addOdd(c);
            }
        }
        return characters;
    }
}
