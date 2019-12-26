package lenghtWord;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class LengthWord {
    public static void main(String[] args) {
        String s = "Hello it is my frase";
        int max = 0;
        String maxWord = "";
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            if (max < words[i].length()){
                max = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println("Максимальное количество букв в слове - " + max + " и это слово " + maxWord);
    }
}
