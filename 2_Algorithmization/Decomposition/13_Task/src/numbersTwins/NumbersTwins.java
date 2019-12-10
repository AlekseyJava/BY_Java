package numbersTwins;

//  Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//  Найти и напечатать все пары «близнецов» из отрезка [n,2n],
//  где n - заданное натуральное число больше 2.
//  Для решения задачи использовать декомпозицию.

public class NumbersTwins {
    public static void main(String[] args) {

        System.out.println("Найти и напечатать все пары близнецов из отрезка [n, 2n], где n > 2");
//  метод ввода числа (n)
        int n = new Variable().value();

//  метод поиска близнецов
        Twins myTwins = new Twins();
        myTwins.twins(n);

    }
}
