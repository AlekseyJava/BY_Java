public class Decision {
    public static void main(String[] args) {
        int N = 0;
        int count = 0;
        Matrix matrix = new Matrix();
        double[][] matrixA = matrix.squareMatrixCreation();
        N = matrix.getN();

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                matrixA[i][j] = Math.sin(((i+1)*(i+1) - (j+1)*(j+1))/N);
                //System.out.print("\t" + matrixA[i][j]);
                if (matrixA[i][j] > 0){
                    count ++;
                }
            }
            System.out.println();
        }

        System.out.format("Количество положительных элементов матрицы: %d ", count);
    }
}
