package factorial;

//Написать метод для вычисления суммы факториалов всех нечетных
//чисел от 1 до 9
public class Factorial {
    public static void main(String[] args) {
        int sum = 0; //Сумма факториалов
        int n = 9; //Вычисляем сумму факториалов до 9 включительно
        SumFact sumFact = new SumFact();
        sum = sumFact.sum(n);
        System.out.println(sum);
    }
}
