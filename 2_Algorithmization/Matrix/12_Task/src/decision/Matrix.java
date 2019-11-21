package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    private int n = 0;
    private int m = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double[][] matrixCreation(){

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

        double[][] matrix = new double[n][m];
        return matrix;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
