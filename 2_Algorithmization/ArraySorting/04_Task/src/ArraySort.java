import arraySort.ArrayOutput;
import arraySort.IncreasingSequence;
import arraySort.SortBySelection;
import arraySort.Value;

public class ArraySort {
    public static void main(String[] args) {
        int n = 0;
        Value value = new Value();
        n = value.size();

        IncreasingSequence sequence = new IncreasingSequence();
        int[] a = sequence.sequence(n);

        new ArrayOutput().output(a);

        //a = new SortBySelection().sort(a);
        a = new ExxchangeSorting().sort(a);

        new ArrayOutput().output(a);

    }
}
