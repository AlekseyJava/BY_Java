package decision;

import enterNumber.EnterNumber;

public class Decision {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        EnterNumber number = new EnterNumber();
        System.out.println("Определить цифры входящие как в первое так и во второе заданные числа");
        a = number.enterNumber();
        b = number.enterNumber();
    }
}
