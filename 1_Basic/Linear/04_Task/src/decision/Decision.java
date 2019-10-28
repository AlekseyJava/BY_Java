package decision;

public class Decision {
    public static void main(String[] args) {
        EnterNumber num = new EnterNumber();
        double d = 0;
        d = num.number();
        Swap swap = new Swap();
        System.out.println(swap.swap(d));

    }
}
