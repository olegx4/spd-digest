public class CharacterSeparator {

    public AsciiSeparatedCharacters separate(String source) {
        final AsciiSeparatedCharacters characters = new AsciiSeparatedCharacters();
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
