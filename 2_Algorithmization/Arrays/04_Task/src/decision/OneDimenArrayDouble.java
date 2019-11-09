package decision;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneDimenArrayDouble {

    private int n = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double[] arrayDouble() {
        System.out.println("Введите размер массива");

        try {
            this.n = Integer.parseInt(this.reader.readLine());
        } catch (Exception var3) {
            System.out.println("Неверно введен размер массива(Должно быть целое положительное число)");
            System.out.println("Попробуйте еще  раз");
            this.arrayDouble();
            var3.printStackTrace();
        }

        double[] array = new double[this.n];

        for(int i = 0; i < this.n; ++i) {
            array[i] = (Math.random() * 100.0D - 50);
            System.out.println(array[i]);
        }

        System.out.println("Массив заполнен числами от -50 до 50");
        System.out.println();
        return array;
    }
}
