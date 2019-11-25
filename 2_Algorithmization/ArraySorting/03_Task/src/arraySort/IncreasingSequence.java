package arraySort;

public class IncreasingSequence {
    public int[] sequence(int size){
        int increase = 0;
        int[] array = new int[size];

        for (int i = 1; i < size; i++){
            increase = (int)(Math.random()*10);
            array[i] = array[i-1] + increase;
        }
        return array;
    }
}
