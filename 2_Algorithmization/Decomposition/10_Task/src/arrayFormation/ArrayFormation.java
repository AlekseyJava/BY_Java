package arrayFormation;

//Дано натуральное число N. Написать метод для формирования массива элементами которого будут цифры числа N
public class ArrayFormation {
    public static void main(String[] args) {

        Variable variable = new Variable(); //объект для считывания целого числа с клавиатуры
        int N = variable.value(); //натуральное число

        //из числа получаем массив цифр
        int[] arrayDigits = new NumberToArrayOfDigits().digits(N);

        //выводим массив
        new ArrayOfDigits().array(arrayDigits);


    }
}
