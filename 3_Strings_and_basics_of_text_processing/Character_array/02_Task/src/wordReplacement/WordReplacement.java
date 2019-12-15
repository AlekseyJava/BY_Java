package wordReplacement;

import java.util.Arrays;

public class WordReplacement {
    public static void main(String[] args) {
        String s = "Hello world, i write word, and words! wordwordword";
        char[] arrayS = s.toCharArray();
        int length = arrayS.length;
        int count = 0; //число вхождений word

//вывод массива символов
        for (int i = 0; i < arrayS.length; i++){
            System.out.print(arrayS[i]);
        }
        System.out.println();
//конец вывода массива символов


        char[] result = Arrays.copyOf(arrayS, length); //массив символов

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

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}
