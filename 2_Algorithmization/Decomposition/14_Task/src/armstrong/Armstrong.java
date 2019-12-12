package armstrong;

//  Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//  возведенная в степень n, равна самому числу.
//  Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию
public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Программа выводит в консоль числа Армстронга от 1 до k");

        int k = new Variable().value(); // число k
        int count = 0;
        int sum = 0;

        count = new CountDigits().count(k);
        System.out.println("Само число: " + k);
        System.out.println("Количество цифр:" + count);
        int[] arrayDigits = new int[count];
        arrayDigits = new CountDigits().arrayDigits(arrayDigits, count, k);

        System.out.println("Массив цифр в числе: ");
        for (int i =0; i < count; i++){
            System.out.print(arrayDigits[i] + "\t");
        }
        System.out.println();

        NumbersArmstrong sum1 = new NumbersArmstrong();
        sum1.numbers(k);


    }
}
