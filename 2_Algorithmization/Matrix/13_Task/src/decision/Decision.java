package decision;

public class Decision {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        double minRows = 0;
        int indexMinRows = 0;
        double maxRows = 0;
        int indexMaxRows = 0;

        Matrix matrix = new Matrix();
        double[][] myMatrix = matrix.matrixCreation();
        n = matrix.getN();
        m = matrix.getM();

        MatrixFilling matrixFilling = new MatrixFilling();
        myMatrix = matrixFilling.matrixFilling(n,m);
        Decision decision = new Decision();
        decision.output(myMatrix, n, m);

        for(int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                minRows = myMatrix[i][j];
                double value = myMatrix[i][j];
                indexMinRows = i;
                for(int k = i+1; k < n; k++){
                    if(minRows > myMatrix[k][j]){
                        minRows = myMatrix[k][j];
                        indexMinRows = k;
                    }

                }
                myMatrix[i][j] = minRows;
                myMatrix[indexMinRows][j] = value;
            }
        }
        System.out.println();
        decision.output(myMatrix, n, m);


        for(int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                maxRows = myMatrix[i][j];
                double value = myMatrix[i][j];
                indexMaxRows = i;
                for(int k = i+1; k < n; k++){
                    if(maxRows < myMatrix[k][j]){
                        maxRows = myMatrix[k][j];
                        indexMaxRows = k;
                    }

                }
                myMatrix[i][j] = maxRows;
                myMatrix[indexMaxRows][j] = value;
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
