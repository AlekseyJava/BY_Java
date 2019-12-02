package area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable {
    double variable = 0;
    public double value(){
        System.out.println("Введите действительное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            variable = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return variable;
    }
}
