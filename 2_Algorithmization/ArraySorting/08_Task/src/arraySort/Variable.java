package arraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int value = 0;
    public int value(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            value = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        return value;
    }

}
