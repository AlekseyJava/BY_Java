package arraySort;

public class ArrayOutput {
    public ArrayOutput() {
    }

    public void output(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
    }
}
