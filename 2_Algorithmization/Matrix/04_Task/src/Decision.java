public class Decision {
    public static void main(String[] args) {

        int n = 0;

        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.squareMatrixCreation();
        n = matrix.getN();
        while (true){
            if (n%2 == 0){
                break;
            }
            else{
                System.out.println("Введите пожалуйста четное число");
                myMatrix = matrix.squareMatrixCreation();
                n = matrix.getN();
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i%2==0){
                    myMatrix[i][j] = j + 1;
                }
                else {
                    myMatrix[i][j] = n - j;
                }
            }

        }

        System.out.println("Вывод матрицы");
        for(int i = 0; i < n; i++){
            for (int j=0; j < n; j++){
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
