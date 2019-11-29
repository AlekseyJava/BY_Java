package arraySort;

public class ArrayFilling {

    //private double[] array;

    public double[] arrayFillingDouble(int n){
        double[] array = new double[n];
        array[0] = Math.random()*10;
        for (int i = 1; i < n; i++){
            array[i] = array[i-1] + (Math.random()*10);
        }
        return array;
    }
}
