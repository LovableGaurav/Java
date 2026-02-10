package regexxx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class practice1 {



        public static void main(String[] args) {
            // 1. Define the pattern
            String regex = "[a-z]+";

            // 2. Compile the pattern
            Pattern pattern = Pattern.compile(regex);

            // 3. Create the matcher for a specific string
            Matcher matcher = pattern.matcher("hello123world");

            // 4. Find matches
            while (matcher.find()) {
                System.out.println("Found: " + matcher.group() +
                        " at " + matcher.start());
            }

    }
}
