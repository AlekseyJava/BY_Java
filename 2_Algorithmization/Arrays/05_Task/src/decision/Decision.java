package decision;

import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        int n  = 0; //size of array
        //int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        n =  Integer.parseInt(scanner.next());
        System.out.println("Введите i");
        int i = Integer.parseInt(scanner.next());

        int[] a = new int[n];

        System.out.println("Введите элементы массива");
        for (int k = 0; k < n;  k++){
            a[k] = Integer.parseInt(scanner.next());
        }

        for (int k = 0; k < n;  k++){
            if (a[k] > i) {
                System.out.println(a[k]);
            }
        }

    }
}
