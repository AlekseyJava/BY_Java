package doubleRow;

//Из заданной строки получить новую, повторив каждый символ дважды
public class DoubleRow {
    public static void main(String[] args) {
        String input = "My string";
        String output = "";
        for (int i = 0; i < input.length(); i++){
            output = output + "" + input.charAt(i) + input.charAt(i);
        }
        System.out.println(output);
    }
}
