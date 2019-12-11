package armstrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int value = 0;
    public int value(){
        System.out.println("Введите натуральное число (k)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            value = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Не корректно введено число");
            e.printStackTrace();
        }
        if (value < 2){
            System.out.println("Число, которое введено, меньше 2-х");
        }
        return value;
    }
}
