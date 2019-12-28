package numberSentences;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//восклицательным или вопросительным знаком.
//Определить количество предложений в строке X.

public class NumberSentences {
    public static void main(String[] args) {
        int countSenteces = 0; //счетчик предложений
        StringBuilder input = new StringBuilder("Hello! My name is Aleksey. I am from Russia. ? I want know Java Core. I will work as java developer.");

        for (int i = 0; i < input.length(); i++){
            if ((input.charAt(i) == '.')||(input.charAt(i) == '!'||(input.charAt(i) == '?'))){
                countSenteces++;
            }
        }

        System.out.printf("Number sentences  = %d", countSenteces);
    }
}
