package arraySort;

public class Sequence {
    public double[] sequence(int size) {
        double[] array = new double[size];

        for(int i = 0; i < size; ++i) {
            array[i] = (Math.random() * 100);
        }

        return array;
    }
}
