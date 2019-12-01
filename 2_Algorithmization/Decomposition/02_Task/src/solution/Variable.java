package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    int valueVariable  = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int value(){
        System.out.println("Введите положительное целое число");
        try {
            valueVariable = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Введено не положительное целое число");
        }
        return valueVariable;
    }
}
