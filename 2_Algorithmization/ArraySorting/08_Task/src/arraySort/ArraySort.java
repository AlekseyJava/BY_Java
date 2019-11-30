package arraySort;

public class ArraySort {
    public static void main(String[] args) {
        int n = 0;
        Variable variable = new Variable();
        n = variable.value();

        int[] p = new Sequence().sequnceFilling(n);
        int[] q = new Sequence().sequnceFilling(n);

        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.output(p);
        arrayOutput.output(q);

        double[] pq = new double[n];
        pq = new ReductionDenominator().sorting(p,q,n);
        pq = new Sort().sorting(pq);

        arrayOutput.output(pq);



    }
}
