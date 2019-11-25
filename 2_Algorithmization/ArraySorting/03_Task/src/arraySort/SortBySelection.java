package arraySort;

public class SortBySelection {
    private int max = 0;
    private int indexMax = 0;
    private int value = 0;
    public int[] sort(int[] array){
        for(int i = 0; i < array.length; i++){
            max = array[i];
            indexMax = i;
            for(int j = i; j < array.length; j++){
                if(max < array[j]){
                    max = array[j];
                    indexMax = j;
                }
            }

            value = array[i];
            array[i] = array[indexMax];
            array[indexMax] = value;


        }
        return array;
    }
}
