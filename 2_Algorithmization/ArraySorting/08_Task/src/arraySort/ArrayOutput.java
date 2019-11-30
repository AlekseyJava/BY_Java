package arraySort;

public class ArrayOutput {
    public void output(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%.2f\t", array[i]);
        }
        System.out.println();
    }

    public void output(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
    }
}
