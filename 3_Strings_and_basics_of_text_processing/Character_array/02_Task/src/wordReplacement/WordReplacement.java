package wordReplacement;

import java.util.Arrays;

public class WordReplacement {
    public static void main(String[] args) {

        String s = "Hello world, i write word, and words! wordwordword";
        char[] inputArray = s.toCharArray();

        char[] result = Arrays.copyOf(inputArray, inputArray.length); //массив символов

        SearchAndChange searchAndChange = new SearchAndChange();
        char[] aresult = searchAndChange.changeWordToLetter(inputArray);

        //вывод массива
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
