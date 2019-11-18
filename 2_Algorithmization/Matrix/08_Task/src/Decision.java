import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decision {
    public static void main(String[] args) {
        int n = 0; //разменрность квадратной матрицы
        int column1 = 0;
        int column2 = 0;
        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.squareMatrixCreation();
        n = matrix.getN();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер столбца");
        try {
            column1 = Integer.parseInt(reader.readLine());
            if ((column1 < 1)&&(column1 > n)){
                System.out.println("Такого столбца не существует!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Введите номер столбца");
        try {
            column2 = Integer.parseInt(reader.readLine());
            if ((column2 < 1)&&(column2 > n)){
                System.out.println("Такого столбца не существует!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                myMatrix[i][j] = (int)(Math.random()*100);
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (j == column1-1){
                    int value = myMatrix[i][j];
                    myMatrix[i][j] = myMatrix[i][column2-1];
                    myMatrix[i][column2-1] = value;
                    //myMatrix[i][j] = 0;

                }
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
