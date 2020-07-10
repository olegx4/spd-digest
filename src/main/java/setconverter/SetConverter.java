package setconverter;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class SetConverter {

    public String toString(Set<Character> characters) throws SetNotInitializedException {
        if (isNull(characters)) {
            throw new SetNotInitializedException("Source set string is not initialised");
        }
        StringBuilder output = new StringBuilder();
        for (char c : characters) {
            if (c != characters.size() && c != characters.iterator().next()) {
                output.append(", ");
            }
            output.append("'").append(c).append("'").append("=").append((int) c);
        }
        return output.toString();
    }
}
