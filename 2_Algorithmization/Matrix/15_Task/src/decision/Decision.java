package decision;

public class Decision {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int max = 0;

        MatrixCreation matrix = new MatrixCreation();
        int[][] myMatrix = matrix.matrixCreation();

        n = matrix.getN();
        m = matrix.getM();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                myMatrix[i][j] = (int)(Math.random()*101);
                if (max < myMatrix[i][j]){
                    max = myMatrix[i][j];
                }
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if ((myMatrix[i][j]%2) != 0){
                    myMatrix[i][j] = max;
                }
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
