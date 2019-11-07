package decision;

import enterNumber.EnterNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {
        double array[];

        System.out.println("Меняем числа массива числом Z, если оно больше Z ");
        ArrayDouble arrayDouble = new ArrayDouble();

        array = arrayDouble.arrayDouble();

        System.out.println("Введите Z");
        EnterNumber number  = new EnterNumber();
        double Z = number.enterNumber();

        for (int i = 0; i < array.length; i++){
            if (array[i] > Z){
                array[i] = Z;
            }
            System.out.println(array[i]);
        }

    }
}
