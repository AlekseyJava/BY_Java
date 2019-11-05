package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = reader.readLine();
            byte[] bytes = s.getBytes("US-ASCII");
            for (int i = 0; i <bytes.length; i++){
                System.out.println(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
