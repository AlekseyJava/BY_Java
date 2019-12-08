package comparison;

//Написать метод для определения в каком из 2-х чисел больше цифр
public class Comparison {
    public static void main(String[] args) {
        System.out.println("Метод для определения в каком из 2-х чисел больше цифр");

        Variable variable = new Variable();
        int a = variable.value();
        int b = variable.value();

        ComparisionNumber comparisionNumber = new ComparisionNumber();
        comparisionNumber.comparDigits(a,b);

    }
}
