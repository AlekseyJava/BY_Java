package arraySort;

public class ArraySort {
    public static void main(String[] args) {
        int n = 0;
        n = new Value().size();
        int[] array = new Sequence().sequence(n);

        new ArrayOutput().output(array);

        new InsertionSorting().sort(array);

        new ArrayOutput().output(array);

    }
}
