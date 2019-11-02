package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterIntegerPositiveNumber {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int number;

    public int positiveNumber(){
        try {
            number = Integer.parseInt(reader.readLine());
            if (number <=0){
                System.out.println("Вы ввели отрицательное число или ноль!");
                System.out.println("Введите пожалуйста целое положительное число");
                positiveNumber();
            }
            return number;
        } catch (Exception e) {
            System.out.println("Число введено не верно");
            System.out.println("Введите пожалуйста целое положительное число");
            //e.printStackTrace();
            positiveNumber();
            return number;
        }
    }
}
