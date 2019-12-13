package sumOfOddNumber;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class SumOfOddNumber {
    public static void main(String[] args) {
        int n = 0;
        n = new Variable().value();

        FindNumbers nubmers = new FindNumbers();
        nubmers.numbers(n);

    }
}
