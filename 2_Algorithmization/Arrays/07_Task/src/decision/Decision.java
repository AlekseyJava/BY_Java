package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {
        int n = 0;
        double max = 0;
        System.out.println("Даны числа a1, a2, .. an. Найти max(a1 + a2n, a2 + a2n-1,.., an + an+1) ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов последовательности");

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        double[] a = new double[n];

        System.out.println("Введите элементы последовательности");
        for (int i = 0; i < a.length; i++ ){
            try {
                a[i] = Double.parseDouble(reader.readLine());
            } catch (IOException e){
                e.printStackTrace();
            }

        }

        for (int i = 0; i < a.length; i++ ){
            max = Double.max(max, a[a.length-i-1] + a[i]);
        }
        System.out.format("Максимальное значение: = %2.2f", max);

    }
}
