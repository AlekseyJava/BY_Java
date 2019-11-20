public class Decision {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.squareMatrixCreation();
        n = matrix.getN();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                myMatrix[i][j] = (int)(Math.random()*100 - 50);
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            if (myMatrix[i][i] > 0){
                sum = sum + myMatrix[i][i];
            }
        }
        System.out.format("Сумма положительных элементов диагонали матрицы равна %d", sum);
    }
}
