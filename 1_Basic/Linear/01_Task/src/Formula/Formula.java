package Formula;

public class Formula {
    public static void main(String[] args) {
        System.out.println("Вычисляем функцию z=((a-3)*b/2) + c");

        double a = 0;
        double b = 0;
        double c = 0;

        EnterNumber num = new EnterNumber();
        a = num.number(a);
        b = num.number(b);
        c = num.number(c);

        Function function = new Function();
        System.out.println(function.func(a, b, c));


    }

}
