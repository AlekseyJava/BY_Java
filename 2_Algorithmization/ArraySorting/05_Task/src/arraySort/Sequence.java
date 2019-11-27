package arraySort;

public class Sequence {
    public Sequence() {
    }

    public int[] sequence(int size) {
        int[] array = new int[size];

        for(int i = 1; i < size; ++i) {
            array[i] = (int)(Math.random() * 100);
        }

        return array;
    }
}
