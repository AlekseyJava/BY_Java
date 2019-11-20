package decision;

public class Matrix {
    private int n = 10;
    private int m = 20;
    //private int[][] matrix = new int[n][m];

    public int[][] matrixFilling(){
        n = 10;
        m = 20;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random()*16);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
