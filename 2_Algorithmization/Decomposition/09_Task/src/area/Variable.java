package area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private double variableValue = 0;
    public double value(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое действительное число");
        while (true) {
            try {
                variableValue = Double.parseDouble(reader.readLine());
                return variableValue;
            } catch (IOException e) {
                System.out.println("Ошибка ввода числа, попробуйте еще раз ввести целое число");
                //e.printStackTrace();
            }
        }
    }
}
