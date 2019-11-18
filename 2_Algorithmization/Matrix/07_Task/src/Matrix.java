import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    private int n = 0;
    private int m = 0;

    public Matrix() {
    }

    //public static void main(String[] args) {
    //}

    public double[][] squareMatrixCreation() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер n квадратной матрицы: ");

        try {
            this.n = Integer.parseInt(reader.readLine());
        } catch (IOException var5) {
            System.out.println("Размер матрицы введен не правильно");
            System.out.println("Должно быть целое положительное число");
            this.squareMatrixCreation();
        }

        this.m = this.n;
        double[][] matrix = new double[this.n][this.m];

        for(int i = 0; i < this.n; ++i) {
            for(int j = 0; j < this.m; ++j) {
                matrix[i][j] = i;
            }
        }

        return matrix;
    }

    public int getN() {
        return this.n;
    }

    public int getM() {
        return this.m;
    }
}
