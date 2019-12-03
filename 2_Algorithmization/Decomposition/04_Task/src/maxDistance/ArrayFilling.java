package maxDistance;

public class ArrayFilling {
    public Integer[][] filling(Integer[][] array, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                array[i][j] = (int)(Math.random()*10);
                System.out.printf("\t %d", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }
}
