package sum;

//Задан массив D.
// Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
// с номерами от k до m.
public class SumOfThree {
    public static void main(String[] args) {
        System.out.println("Программа вычисления суммы трех последовательно расположенных" +
                " элементов массива с номерами от k до m");

        Variable variable = new Variable();
        int n = variable.value();
        int k = variable.value();
        int m = variable.value();

        int[] D = new int[n];
        D = new ArrayRandom().arrayFilling(D);//заполняем массив случайными числами от 0 до 9
        Sum mySum = new Sum();
        mySum.sum(k,m,D);//метод вычисляющий и выводящий сумму трех элементов от к до m
    }
}
