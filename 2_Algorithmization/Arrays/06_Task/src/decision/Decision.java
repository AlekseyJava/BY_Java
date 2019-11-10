package decision;

import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        int N  = 0; //size of array
        int sum = 0;
        int variable = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        N =  Integer.parseInt(scanner.next());
        //System.out.println("Введите i");
        //int i = Integer.parseInt(scanner.next());

        int[] a = new int[N];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < N;  i++){
            a[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i < a.length; i++){
            variable = 0;
            for (int j = 2; j < a[i]; j++){
                if(((a[i]%j) == 0)||(a[i]==2)) {
                    variable = 1;
                    //sum = sum + a[i];
                }

            }

            if (variable == 0){
                sum = sum + a[i];
            }
        }

        System.out.println(sum);
    }
}
