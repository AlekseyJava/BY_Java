package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    private int n = 0;
    private int m = 0;
    //int[][] matrix = int
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int[][] matrix(){

        System.out.println("Введите размеры матрицы n*m");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            m = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random()*100 + 1);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }


        return matrix;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
