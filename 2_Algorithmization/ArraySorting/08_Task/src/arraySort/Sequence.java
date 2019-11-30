package arraySort;

public class Sequence {
    public int[] sequnceFilling(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int)(1+Math.random()*10);
        }
        return array;
    }
}
