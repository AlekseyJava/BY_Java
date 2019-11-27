package arraySort;

public class InsertionSorting {
    public int[] sort(int[] array){
        //int i = 0;
        int j = 0;
        for (int i = 1; i < array.length; i++)
        {
            int value = array[i];
            j = i;
            while (j > 0 && value < array[j - 1]){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }

        return array;
    }
}
