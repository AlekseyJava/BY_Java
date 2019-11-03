package decision;

public class Decision {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Выводим сумму квадратов первых 100 чисел");
        for (int i = 0; i<=100; i++){
            sum = sum + i*i;
        }
        System.out.println("Сумма квадратов первых 100 чисел равна: " + sum);
    }
}
