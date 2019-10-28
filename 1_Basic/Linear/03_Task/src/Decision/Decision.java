package Decision;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Вычисляем значение по формуле: (sin(x) + cos(y))/(cos(x) - sin(y))*tg(x*y)");
        EnterNumber num = new EnterNumber();

        double x  = num.number();
        double y = num.number();

        Formula formula = new Formula();
        formula.formula(x,y);
    }
}
