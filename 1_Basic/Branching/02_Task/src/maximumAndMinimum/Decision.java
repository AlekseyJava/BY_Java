package maximumAndMinimum;

public class Decision {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double result;
        EnterNumber number = new EnterNumber();
        a = number.enterNumber();
        b = number.enterNumber();
        c = number.enterNumber();
        d = number.enterNumber();

        Minimum min1 = new Minimum();
        Minimum min2 = new Minimum();
        Maximum max = new Maximum();
        result = max.max(min1.min(a,b),min2.min(c,d));
        System.out.println(result);
    }

}
