package patternAndMather;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("1\\+1=2");
        Matcher m1 = p1.matcher("1+1=2 и 1+1=2");

        while (m1.find()){
            System.out.println("Найден паттерн с символа " + m1.start() + " " + m1.group());
        }
    }
}
