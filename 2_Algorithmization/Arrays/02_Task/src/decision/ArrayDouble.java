package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArrayDouble {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public double[] arrayDouble(){
        Random random = new Random();
        //double[] array;
        int n = 0;
        System.out.println("Введите размер массива");
        try {
            n = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        double[] array = new double[n];
        for (int i = 0; i < n; i++){
            array[i] = random.nextInt(100)+random.nextDouble();
            System.out.println(array[i]);
        }
        return array;
    }
}
