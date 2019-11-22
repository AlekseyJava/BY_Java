package decision;

public class Decision {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int random = 0;
        int sum = 0;
        Matrix matrix = new Matrix();

        int[][] myMatrix = matrix.matrixCreation();
        n = matrix.getN();
        m = matrix.getM();

        for (int j = 0; j < m; j++){
            sum = 0;
                    while (sum < j+1){
                        random = (int)(Math.random()*(n));
                        System.out.println(random);

                        if (myMatrix[random][j] != 1){
                            myMatrix[random][j] = 1;
                            sum = sum +1;
                            System.out.println(sum);
                        }
                }
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
