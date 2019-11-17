package decision;

public class Decision {
    public static void main(String[] args) {

        int n = 0;
        Matrix myMatrix = new Matrix();
        int[][] matrix = myMatrix.squareMatrixCreation();
        n = myMatrix.getN();

        if (n%2 == 1){
            System.out.println("Введите пожалуйста четное положительное число");
            matrix = myMatrix.squareMatrixCreation();
            n = myMatrix.getN();
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((i + j) < n){
                    matrix[i][j] = i+1;
                }
                else{
                    matrix[i][j] = 0;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

    }
}
