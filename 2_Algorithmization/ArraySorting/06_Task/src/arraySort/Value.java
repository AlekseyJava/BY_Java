package arraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Value {
    private int n = 0;
    BufferedReader reader;

    public Value() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int size() {
        System.out.println("Enter positive whole value");

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException var2) {
            System.out.println("Размер должен быть целым положительным числом");
            var2.printStackTrace();
        }

        return n;
    }
}
