package sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int variableValue = 0;
    public int value(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое положительное число");
        while (true) {
            try {
                variableValue = Integer.parseInt(reader.readLine());
                return variableValue;
            } catch (IOException e) {
                System.out.println("Ошибка ввода числа, попробуйте еще раз ввести целое число");
               //e.printStackTrace();
            }
        }
    }
}
