package countDigits;

// В строке найти количество цифр.

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Находим количество цифр в строке");
        int count = 0;

        String myString;
        InputString inputString = new InputString();
        myString = inputString.input();

        char[] array = myString.toCharArray();

        count = new Count().countDigits(array);
        System.out.println("Количество цифр = " + count);

    }
}
