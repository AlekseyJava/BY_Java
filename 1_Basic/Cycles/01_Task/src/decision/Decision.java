package decision;

public class Decision {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        EnterIntegerPositiveNumber number = new EnterIntegerPositiveNumber();
        x = number.positiveNumber();
        for (int i = 0; i <= x; i++){
            sum = sum  + i;
        }
        System.out.println(sum);
    }
}
