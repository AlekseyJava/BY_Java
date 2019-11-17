public class Decision {
    public static void main(String[] args) {

        int n = 0;
        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.squareMatrixCreation();
        n = matrix.getN();
        if(n%2==1){
            System.out.println("Введите пожалуйста целое четное число");
            myMatrix = matrix.squareMatrixCreation();
            n = matrix.getN();
        }

        for(int i = 0; i < n/2; i++){
            for (int j = 0; j < n; j++){
                if ((i > j)||((i+j)>=n)){
                    myMatrix[i][j] = 0;
                }
                else{
                    myMatrix[i][j] = 1;
                }
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }

        for(int i = n/2; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((i < j)||((i+j+1)<n)){
                    myMatrix[i][j] = 0;
                }
                else{
                    myMatrix[i][j] = 1;
                }
                System.out.print("\t" + myMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
