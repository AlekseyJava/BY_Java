package Formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double number = 0;

    public double number (){
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
