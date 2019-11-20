package decision;

public class Decision {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] myMatrix = matrix.matrixFilling();
        int value = 0;
        int count = 0;

        for(int i = 0; i < matrix.getN(); i++){
            //count = 0;
            for(int j = 0; j < matrix.getM(); j++){
                if (myMatrix[i][j] == 5){
                    count++;
                }
            }
            if (count >=3) System.out.format("В строке %d число 5 встречается %d раз \n", i+1, count);
            count = 0;
        }
    }
}
