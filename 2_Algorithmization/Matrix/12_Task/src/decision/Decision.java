package decision;

public class Decision {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        double minCow = 0;
        int indexMinCow = 0;
        double maxCow = 0;
        int indexMaxCow = 0;

        Matrix matrix = new Matrix();
        double[][] myMatrix = matrix.matrixCreation();
        n = matrix.getN();
        m = matrix.getM();

        MatrixFilling matrixFilling = new MatrixFilling();
        myMatrix = matrixFilling.matrixFilling(n,m);
        Decision decision = new Decision();
        decision.output(myMatrix, n, m);

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                minCow = myMatrix[i][j];
                double value = myMatrix[i][j];
                indexMinCow = j;
                for(int k = j+1; k < m; k++){
                    if(minCow > myMatrix[i][k]){
                        minCow = myMatrix[i][k];
                        indexMinCow = k;
                    }

                }
                myMatrix[i][j] = minCow;
                myMatrix[i][indexMinCow] = value;
            }
        }
        System.out.println();
        decision.output(myMatrix, n, m);

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                maxCow = myMatrix[i][j];
                double value = myMatrix[i][j];
                indexMaxCow = j;
                for(int k = j+1; k < m; k++){
                    if(maxCow < myMatrix[i][k]){
                        maxCow = myMatrix[i][k];
                        indexMaxCow = k;
                    }

                }
                myMatrix[i][j] = maxCow;
                myMatrix[i][indexMaxCow] = value;
            }
        }
        System.out.println();
        decision.output(myMatrix, n, m);
    }


    public void output(double[][] matrix, int n, int m){
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j++){
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }

}
