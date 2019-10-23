package Formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    //int number = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double number (double number){
        System.out.println("Введите значение: ");
        try {
            number = Double.parseDouble(reader.readLine());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return number;
    }
}
