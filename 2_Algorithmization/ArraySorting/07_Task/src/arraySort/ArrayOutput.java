package arraySort;

public class ArrayOutput {
    public void output(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.format("%.2f\t", array[i]);
        }
        System.out.println();
    }
}
