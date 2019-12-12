package increasingSequence;

public class ArrayDigitsNumber {

    public int[] arrayDigits(int[] array, int n, int k){ //массив, разрядность, число
        for (int i = 0; i < n; i++){
            array[i] = k%10; //
            k = k/10;
        }

        return array;
    }

}
