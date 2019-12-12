package increasingSequence;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class IncreasingSequence {
    public static void main(String[] args) {

        System.out.println("Программа нахождения натуральных n-значных чисел, цифры в которых образуют строго возрастающую\n" +
                "последовательность (например, 1234, 5789).");

        int n = new Variable().value();
        new FindNumbers().find(n);


    }
}
