package arraySort;

public class ArraySort {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        Variable variable = new Variable();
        n = variable.value();
        m = variable.value();

        ArrayFilling arrayFilling = new ArrayFilling();

        double[] a = new double[n];
        double[] b = new double[m];
        a = arrayFilling.arrayFillingDouble(n);
        b = arrayFilling.arrayFillingDouble(m);

        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.output(a);
        arrayOutput.output(b);

        a = new Sort().sorting(a,b);

        arrayOutput.output(a);


    }
}
