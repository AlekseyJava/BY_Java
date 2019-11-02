import enterNumber.EnterNumber;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Вычисляем F(x)");
        System.out.println("F(x) = x*x - 3x + 9, если x <= 3");
        System.out.println("F(x) = 1/(x*x*x + 6), если x > 3");

        double x = new EnterNumber().enterNumber();

        if (x <= 3) {
            System.out.println(x*x - 3*x + 9);
        }
        else {
            System.out.println(1/(x*x*x + 6));
        }
    }
}
