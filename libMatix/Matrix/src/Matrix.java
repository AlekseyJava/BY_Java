import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

   // public static void main(String[] args) {
  //  }
    private int n = 0;
    private int m = 0;


    public int[][] squareMatrixCreation(){
        //System.out.println("Matrix in jar, in method matrixFill");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер n квадратной матрицы: ");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Размер матрицы введен не правильно");
            System.out.println("Должно быть целое положительное число");
            squareMatrixCreation();
            //e.printStackTrace();
        }

        m = n;
        int [][] matrix = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j ++){
                matrix[i][j] = i;
            }
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
