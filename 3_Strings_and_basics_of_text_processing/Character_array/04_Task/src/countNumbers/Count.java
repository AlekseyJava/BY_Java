package countNumbers;

public class Count {
    private int count = 0;
    public int countNumbers(char[] array){
        count = 0;
        for(int i = 0; i < array.length -1; i++){
            if(((array[i] > 47)&&(array[i] < 58))&&((array[i+1]<48)||(array[i+1]>57))){
                count ++;
            }
        }
        if (((array[array.length -1] > 47)&&(array[array.length -1] < 58))){
            count++;
        }
        return count;
    }
}
