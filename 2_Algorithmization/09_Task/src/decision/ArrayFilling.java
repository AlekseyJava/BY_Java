package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFilling {
    private int n = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int[] arrayFilling(){
        System.out.println("Введите количество элементов массива");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Количество элементов массива должно быть целым положительным числом");
            System.out.println("Попробуйте еще раз");
            e.printStackTrace();
        }
        int[] a = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++){
            try {
                a[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    public int getN() {
        return n;
    }
}
