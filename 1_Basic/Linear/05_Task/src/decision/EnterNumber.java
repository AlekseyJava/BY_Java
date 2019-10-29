package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int number(){
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
}
