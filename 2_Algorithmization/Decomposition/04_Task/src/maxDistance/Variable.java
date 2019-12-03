package maxDistance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    private int value = 0;
    public int value(){
        System.out.println("Введите целое положительное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            value = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
