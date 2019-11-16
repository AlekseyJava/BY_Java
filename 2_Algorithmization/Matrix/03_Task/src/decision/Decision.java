package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {

        int k = 0;
        int p = 0;
        int n = 0;
        int m = 0;

        System.out.println("Выводим k-ю строку и p-ый столбец матрицы");

        Matrix randomMatrix = new Matrix();
        int[][] matrix = randomMatrix.matrix();
        n = randomMatrix.getN();
        m = randomMatrix.getM();

        //System.out.println(n + " " + m);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер k-ой строки: ");
        try {
            k = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Введите номер p-ого столбца: ");
        try {
            p = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Выводим строку: ");
        for(int j = 0; j < m; j++){
            System.out.print("\t" + matrix[k-1][j]);
        }
        System.out.println();

        System.out.println("Выводим столбец: ");
        for (int i = 0; i < n; i++){
            System.out.print("\t" + matrix[i][p-1]);
        }
    }
}
