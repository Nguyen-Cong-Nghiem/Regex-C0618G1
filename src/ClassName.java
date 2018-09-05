import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String Classname = "C0618G1";

    public ClassName() {

    }

    public boolean getName(String regex) {
        Pattern pattern = Pattern.compile(Classname);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
