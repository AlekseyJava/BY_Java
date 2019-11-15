package decision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

    private int n = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int[][] matrix(){

        System.out.println("Введите размеры матрицы n*n");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*100 + 1);
            }
        }

        return matrix;
    }

}
