package decision;

public class Decision {
    public static void main(String[] args) {
        Matrix randomMatrix = new Matrix();
        int[][] matrix = randomMatrix.matrix();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Полученная матрица");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j=j+2){
                if (matrix[0][j] > matrix[matrix.length - 1][j]){
                System.out.print(" " + matrix[i][j]);
                }
            }
            System.out.println();
        }

    }
}
