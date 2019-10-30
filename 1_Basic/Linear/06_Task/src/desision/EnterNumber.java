package desision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double n = 0;

    public double number(){
        System.out.println("Enter number");
        try {
            n = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
}
