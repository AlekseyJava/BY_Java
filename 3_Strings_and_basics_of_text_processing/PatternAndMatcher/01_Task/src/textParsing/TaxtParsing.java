package textParsing;

//Cоздать приложение, разбирающее текст (текст хранится в строке)
//  позволяющее выполнять с текстом три различных операции:
// 1. отсортировать абзацы по количеству предложений;
// 2. в каждом предложении отсортировать слова по длине;
// 3. отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
// а в случае равенства – по алфавиту.

import myPackahe_1.Hello;
import sun.dc.path.PathError;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaxtParsing {
    public static void main(String[] args) {

        String inputString;

        InputText text = new InputText();
        inputString = text.input();

        String pattern = "\\\\n";
        int countParagraph = 1;

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        Pattern myPattern = Pattern.compile("a");
        Matcher matcher1 = myPattern.matcher(inputString);

        while (matcher.find()){
            countParagraph++;
        }

        System.out.println(inputString);
        System.out.println("Количество абзацев - " + countParagraph);

    }
}
