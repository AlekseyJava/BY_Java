package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNaturalNumber {
    private int number = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int naturalNumber(){
        System.out.println("Введите натуральное число");
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Введено не натуральное число");
            System.out.println("Введите число еще раз");
            naturalNumber();
        }
        if (number < 1){
            naturalNumber();
        }
        return number;
    }
}
