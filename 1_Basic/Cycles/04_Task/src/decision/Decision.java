package decision;

import java.math.BigInteger;

public class Decision {
    public static void main(String[] args) {
        //BigInteger product = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        //BigInteger per = new BigInteger("723657587325");
        //long product = 0;
        BigInteger product = new BigInteger("1");
        System.out.println("Выводим произведение квадратов первых 200 чисел");
        for (int i = 1; i<=200; i++){
            //BigInteger
            //per = i*i;
            //product = product*i*i;
            BigInteger a = new BigInteger(String.valueOf(i*i));
            product = product.multiply(a);
        }
        System.out.println("Произведение квадратов первых 200 чисел равна: " + product);
    }
}
