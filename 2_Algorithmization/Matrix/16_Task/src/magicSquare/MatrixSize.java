package magicSquare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixSize {
    private int n = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int matrixSize(){
        System.out.println("Введите размер матрицы");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Число введено не верно");
            e.printStackTrace();
        }
        return n;
    }

}
