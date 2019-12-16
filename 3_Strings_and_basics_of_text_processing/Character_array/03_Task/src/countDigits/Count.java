package countDigits;

public class Count {
    private int count = 0;
    public int countDigits(char[] array){
        count = 0;
        for(int i = 0; i < array.length; i++){
            if((array[i] > 47)&&(array[i] < 58)){
                count ++;
            }
        }
        return count;
    }
}
