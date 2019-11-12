package decision;

import enterNumber.EnterNumber;

import java.text.DecimalFormat;

public class Decision {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        EnterNumber number = new EnterNumber();
        System.out.println("Определить цифры входящие как в первое так и во второе заданные числа");
        a = number.enterNumber();
        b = number.enterNumber();
        //String as = String.valueOf((long)a);
        //DecimalFormat format = new DecimalFormat(".");
        //String as = format.format(a);
        String as = String.valueOf((long)a);
        String bs = String.valueOf((long)b);
        System.out.println(as);
        //System.out.println(bs);

        for (int i = 0; i < 10; i++){
            //System.out.println(as.indexOf(String.valueOf((long)i)));
            //.out.println(bs.indexOf(String.valueOf(i)));
            if ((as.indexOf(String.valueOf(i))!= -1)&&(bs.indexOf(String.valueOf(i))!= -1)) {
                System.out.println(i);
            }

        }
    }
}
