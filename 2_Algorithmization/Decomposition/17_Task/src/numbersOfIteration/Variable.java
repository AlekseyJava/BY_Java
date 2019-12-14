package numbersOfIteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int value = 0;
    public int value(){
        System.out.println("Введите натуральное число");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            value = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Не корректно введено число");
            e.printStackTrace();
        }
        if (value < 1){
            System.out.println("Число, которое введено, меньше 1");
        }
        return value;
    }
}
