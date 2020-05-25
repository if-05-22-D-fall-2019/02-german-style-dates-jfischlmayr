import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {

    private static final String PATTERN = "\\d{2}\\.\\d{2}\\.\\d{4}";
    private static Pattern pattern = Pattern.compile(PATTERN);

    public static Matcher getMatcher(String dateString) {
        return pattern.matcher(dateString);
    }
}
