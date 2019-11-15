package decision;

public class Decision {
    public static void main(String[] args) {

        Matrix randomMatrix = new Matrix();
        int[][] myMatrix = randomMatrix.matrix();

        for(int i = 0; i < myMatrix.length; i++){
            for(int j = 0; j < myMatrix.length; j++){
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
        //System.out.println();
        System.out.println("\nВыводим на экран все элементы стоящие по диагонали");

        for (int i = 0; i < myMatrix.length; i++){
            System.out.print("\t" + myMatrix[i][i]);
        }
    }
}
