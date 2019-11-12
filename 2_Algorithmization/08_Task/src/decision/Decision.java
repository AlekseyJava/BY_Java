package decision;

import java.util.Arrays;

public class Decision {
    public static void main(String[] args) {
        ArrayFilling array = new ArrayFilling();
        double[] myArray = array.arrayFilling();
        double[] newArray = new double[myArray.length];
        double min = myArray[0];
        int k = 0;

        for (int i = 0; i < myArray.length; i++){
            if (min > myArray[i]){
                min = myArray[i];
            }
        }

        for (int i = 0, j = 0; i < myArray.length; i++, j++){
            newArray[j] = myArray[i];
            if (min == myArray[i]){
                j = j - 1;
                k = k + 1;
            }
        }

        newArray = Arrays.copyOf(newArray,myArray.length - k);

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }


    }
}
