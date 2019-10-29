package decision;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        EnterNumber number = new EnterNumber();
        n = number.number();

        ParseTime parse = new ParseTime();
        parse.purseTime(n);
    }
}
