package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double num = 0;
    public double number(){
        System.out.println("Введите действительное число в формате nnn.ddd");
        try {
            num = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;

    }
}
