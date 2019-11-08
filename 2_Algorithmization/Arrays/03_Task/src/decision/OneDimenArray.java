package decision;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneDimenArray {
    int n = 0;
    BufferedReader reader;

    public OneDimenArray() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public double[] arrayDouble() {
        System.out.println("Введите размер массива");

        try {
            this.n = Integer.parseInt(this.reader.readLine());
        } catch (Exception var3) {
            System.out.println("Неверно введен размер массива(Должно быть целое положжительное число)");
            System.out.println("Попробуйте еще  раз");
            this.arrayDouble();
            var3.printStackTrace();
        }

        double[] array = new double[n];

        for(int i = 0; i < this.n; ++i) {
            array[i] = (int)(Math.random() * 100.0D - 50);
        }

        System.out.println("Массив заполнен числами от 1 до 100");
        return array;
    }

}
