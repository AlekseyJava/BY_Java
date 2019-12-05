package compireNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int n = 0;
    public int value(){
        System.out.println("Введите простое число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Введено не простое число");
            e.printStackTrace();
        }
        return n;
    }
}
