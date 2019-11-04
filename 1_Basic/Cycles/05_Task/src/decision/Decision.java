package decision;

import enterNumber.EnterNumber;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Находим сумму члена ряда an = pow(2,-n) + pow(3,-n) модуль которых больше или равен заданному e");
        EnterNumber number = new EnterNumber();
        double e = number.enterNumber();
        double a = 0;
        double sum = 0;
        int n = 0;

        do {
            n = n + 1;
            a = Math.pow(2,-n) + Math.pow(3,-n);
            sum = sum + a;
        }
        while (a >= e);


        System.out.println(a);
        System.out.println("Сумма членов ряда равна: " + sum);
    }

}
