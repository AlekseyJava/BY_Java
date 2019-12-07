package sum;

//Задан массив D.
// Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
// с номерами от k до m.
public class SumOfThree {
    public static void main(String[] args) {
        int n = 0; //размер массива
        int k = 0;
        int m = 0;

        Variable variable = new Variable();
        n = variable.value();
        k = variable.value();
        m = variable.value();

        int[] D = new int[n];
        D = new ArrayRandom().arrayFilling(D);//заполняем массив случайными числами от 0 до 9
        Sum mySum = new Sum();
        mySum.sum(k,m,D);//метод вычисляющий и выводящий сумму трех элементов от к до m
    }
}
