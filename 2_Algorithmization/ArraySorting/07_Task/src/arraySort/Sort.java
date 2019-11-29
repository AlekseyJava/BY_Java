package arraySort;

import java.util.Arrays;

public class Sort {
    private int firstArrayLength;
    private int secondArrayLength;
    public double[] sorting(double[] a, double[] b){
        firstArrayLength = a.length;
        secondArrayLength = b.length;
        a  = Arrays.copyOf(a, firstArrayLength + secondArrayLength);

        for (int i = 0; i < a.length; i++){
            //if(i < )
        }
        return a;
    }
}
