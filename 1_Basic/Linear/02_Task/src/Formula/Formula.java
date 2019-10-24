package Formula;

public class Formula {
    public static void main(String[] args) {
        System.out.println("Вычисляем значения по формуле: a + b + c");
        EnterNumber num = new EnterNumber();
        double a = num.number();
        double b = num.number();
        double c = num.number();

        new Function().func(a, b, c);
    }
}
