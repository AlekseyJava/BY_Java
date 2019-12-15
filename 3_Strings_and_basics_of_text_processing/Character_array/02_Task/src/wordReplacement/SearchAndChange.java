package wordReplacement;

import java.util.Arrays;

public class SearchAndChange {
    private int length = 0; //длина массива символов
    private int count = 0; //число вхождений слова

    public char[] changeWordToLetter(char[] result){
        length = result.length;
        for(int i = 0; i < (length - 3); i++){
            if ((result[i] == 'w')&&(result[i+1] == 'o')&&(result[i+2] == 'r')&&(result[i+3] == 'd')){
                length = length +2;
                result = Arrays.copyOf(result,length);

                //переставление символов от конца до i-го
                for(int j = length -1; j > i; j--){
                    result[j] = result[j -2];
                }

                result[i] = 'l';
                result[i+1] = 'e';
                result[i+2] = 't';
                result[i+3] = 't';
                result[i+4] = 'e';
                result[i+5] = 'r';
                i = i + 5;
                count++;
            }
        }
        return result;
    }
}
