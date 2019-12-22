package tort;

//получить из слова информатика слово торт

public class CopyAndConcatanation {
    public static void main(String[] args) {
        String input = "информатика";
        String output = input.substring(7,8) + input.substring(3,5) + input.substring(7,8);
        System.out.println(output);
    }
}
