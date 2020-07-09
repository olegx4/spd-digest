import java.util.HashSet;
import java.util.Set;

public class Main {
    private static int sumAsciiValues(Set<Character> characters) {
        int sum = 0;
        for (char c : characters) {
            sum += c;
        }
        return sum;
    }

    public static void main(String[] args) {
        String source = "SPD-University";
        String target = source.toUpperCase();
        Set<Character> oddCharacters = new HashSet<>();
        Set<Character> evenCharacters = new HashSet<>();
        int oddSum, evenSum;

        for (char c : target.toCharArray()) {
            if ((int) c % 2 == 0) {
                evenCharacters.add(c);
            } else {
                oddCharacters.add(c);
            }
        }

        evenSum = sumAsciiValues(evenCharacters);
        oddSum = sumAsciiValues(oddCharacters);
        System.out.println("First group of even Ascii code symbols : " + evenCharacters);
        System.out.println("Second group of odd Ascii code symbols : " + oddCharacters);
        System.out.printf("The difference between the sum of the first (%d) and second (%d) groups = %d \n", evenSum, oddSum, (evenSum - oddSum));
    }
}
