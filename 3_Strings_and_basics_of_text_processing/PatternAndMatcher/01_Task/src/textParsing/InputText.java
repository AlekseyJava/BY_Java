package textParsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText {
    String s;
    public String input (){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return s;
    }
}
