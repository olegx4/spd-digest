package setconverter;

import exception.SetNotInitializedException;

import java.util.Set;

import static java.util.Objects.isNull;

public class SetConverter {

    public String toString(Set<Character> characters) throws SetNotInitializedException {
        if (isNull(characters)) {
            throw new SetNotInitializedException("Source set string is not initialised");
        }
        String output = "";
        for (char c : characters) {
            if (c != characters.size() && c != characters.iterator().next()) {
                output = output.concat(", ");
            }
            output = output.concat("'" + c + "'=" + (int) c);
        }
        return output;
    }
}
