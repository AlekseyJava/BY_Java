package arraySort;

public class Sort {
    public double[] sorting(double[] array){

        for(int i = 0; i < array.length; i++){
            double max = array[i];
            int indexMax = i;
            for(int j = i; j < array.length; j++){
                if(max < array[j]){
                    max = array[j];
                    indexMax = j;
                }
            }

            double value = array[i];
            array[i] = array[indexMax];
            array[indexMax] = value;


        }
        return array;
    }
}
