package deleteSymbol;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef
public class DeleteSymbol {
    public static void main(String[] args) {
        String str = "Hello it is my frase!!!";
        str = str.replace(" ","");
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(str);
        System.out.println(sb);
        //sb.replace()

        StringBuilder sb1 = new StringBuilder();
        int idx;
        //str.reverse();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            idx = str.indexOf(c, i + 1);
            if (idx == -1) {
                sb1.append(c);
            }
        }
        //sb1.reverse();
        System.out.println(sb1);
    }
}
