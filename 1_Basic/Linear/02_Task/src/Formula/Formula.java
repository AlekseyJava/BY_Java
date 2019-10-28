package Formula;

public class Formula {
    public static void main(String[] args) {
        System.out.println("Вычисляем значения по формуле: (b + Math.sqrt(b*b + 4*a*c))/(2*a) - a*a*a + 1/(b*b)");
        EnterNumber num = new EnterNumber();
        double a = num.number();
        double b = num.number();
        double c = num.number();

        new Function().func(a, b, c);
    }
}
