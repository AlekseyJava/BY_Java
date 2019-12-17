package countNumbers;

//Нахождение количество чисел в строке

public class CountNumbersInString {
    public static void main(String[] args) {
        System.out.println("Находим количество чисел в строке");
        int count = 0;

        String myString;
        InputString inputString = new InputString();
        myString = inputString.input();

        char[] array = myString.toCharArray();

        count = new Count().countNumbers(array);
        System.out.println("Количество чисел в строке = " + count);

    }
}
