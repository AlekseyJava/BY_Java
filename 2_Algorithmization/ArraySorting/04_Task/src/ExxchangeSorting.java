public class ExxchangeSorting {
    private int value = 0;
    private int count  = 0;

    public int[] sort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++){
                if(array[j]<array[j+1]){
                    value = array[j];
                    array[j] = array[j+1];
                    array[j+1] = value;
                    count++;
                }
            }
        }
        System.out.println("Количество перестановок = " + count);
        return array;
    }
}
