package enterNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double doubleNumber = 0.0;

    public double enterNumber(){
        System.out.println("Введите дйествительное число: ");
        try {
            doubleNumber = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Вы ввели не число(число введенно не корректно), попробуйте еще раз!");
            enterNumber();
        }
        return doubleNumber;
    }
}
