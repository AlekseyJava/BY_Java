package armstrong;

public class CountDigits {
    private int count = 0;
    public int count(int n){
        count = 1;
        for (int i = 0; i <= n; i++){
            if(n/10 != 0){
                count ++;
            }
            n = n/10;
        }
        return count;
    }


    public int[] arrayDigits(int[] array, int count, int k){
        for (int i = 0; i < count; i++){
            array[i] = k%10;
            k = k/10;
        }
        return array;
    }
}
