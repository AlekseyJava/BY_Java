package numbersOfIteration;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class NumbersOfIteration {
    public static void main(String[] args) {

        int n = new Variable().value();//вводим число
        int count = 0;
        int sum = 0;

        SumDigits sumDigits = new SumDigits();
        sum = sumDigits.sum(n);
        while (n > 0){
            count++;
            n = n - sum;
            sum = sumDigits.sum(n);
            System.out.println("Промежуточное число: " + n);
        }
        System.out.println("Количество итераций = " + count);

    }
}
