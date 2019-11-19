public class Decision {
    public static void main(String[] args) {
        int n = 0;
        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.squareMatrixCreation();
        n = matrix.getN();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                myMatrix[i][j] = (int)(Math.random()*100 + 1);
            }
        }

        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print("\t" + myMatrix[i][j]);
                sum = sum + myMatrix[j][i];
            }
            //System.out.print("\t Сумма столбца" + sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
            System.out.println();
            sum = 0;
        }
        System.out.println();
        System.out.println("Максимальная сумма столбца" + maxSum);

    }
}
