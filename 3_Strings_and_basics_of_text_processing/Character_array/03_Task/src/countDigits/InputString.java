package countDigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {

    private String s;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String input(){
        System.out.println("Введите строку");
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
