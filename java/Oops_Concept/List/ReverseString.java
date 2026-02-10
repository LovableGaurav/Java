package List;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
            String input = "Gemini";

            // 1. Convert String to List of Characters
            List<Character> charList = new ArrayList<>();
            for (char c : input.toCharArray()) {
                charList.add(c);
            }

            // 2. Use Collections utility to reverse
            Collections.reverse(charList);

            // 3. Build the string back
            StringBuilder reversed = new StringBuilder();
            for (char c : charList) {
                reversed.append(c);
            }

            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed.toString());

    }
}
