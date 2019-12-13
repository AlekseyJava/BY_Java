package sumOfOddNumber;

public class ArrayDigitsNumber {
    //int array = ne
    public int[] arrayDigits(int n, int k){ //разрядность, число
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = k%10; //
            k = k/10;
        }

        return array;
    }

}
