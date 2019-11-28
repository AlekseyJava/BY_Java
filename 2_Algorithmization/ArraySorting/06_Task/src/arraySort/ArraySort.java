package arraySort;

public class ArraySort {
    public static void main(String[] args) {
        int n = 0;
        n = new Value().size();

        double[] a = new Sequence().sequence(n);

        new ArrayOutput().output(a);

        new ShellSorting().sort(a);

        new ArrayOutput().output(a);


    }
}
