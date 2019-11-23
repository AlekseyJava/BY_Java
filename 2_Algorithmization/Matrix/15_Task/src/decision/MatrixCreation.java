package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixCreation {
    private int n = 0;
    private int m = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int[][] matrixCreation(){

        System.out.println("Введите количество строк матрицы");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Число введено не верно");
            e.printStackTrace();
        }

        System.out.println("Введите количество столбцов матрицы");
        try {
            m = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Число введено не верно");
            e.printStackTrace();
        }

        int[][] matrix = new int[n][m];
        return matrix;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
