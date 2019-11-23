package magicSquare;

public class MagicSquare {
    public static void main(String[] args) {
        int n = 0;
        int magicSum;
        MatrixSize matrixSize = new MatrixSize();

        n = matrixSize.matrixSize();
        int[][] matrix = new int[n][n];

        if (n < 3){
            System.out.println("Магических квадратов меньше 2-го уровня не существует:");
        }
//------------------------------------------------
        else{

            magicSum = (n*(n*n + 1))/2;


            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = magicSum;
                    //System.out.print("Здесь нужно изучить методы магического квадрата");
                }
            }
            System.out.println(magicSum);
            System.out.print("Здесь нужно изучить методы магического квадрата");

        }
//-------------------------------------------------

    }
}
