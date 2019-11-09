package decision;

public class Decision {
    public static void main(String[] args) {
        double[] array;

        int indexMin = 0;
        int indexMax = 0;
        OneDimenArrayDouble arrayDouble = new OneDimenArrayDouble();
        array = arrayDouble.arrayDouble();
        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }

        double variable = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = variable;

        for(int i = 0; i <  array.length; i++){
            System.out.println(array[i]);
        }

    }
}
