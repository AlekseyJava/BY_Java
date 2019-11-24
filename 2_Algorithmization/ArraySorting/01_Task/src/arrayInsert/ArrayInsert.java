package arrayInsert;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int k = 0;
        Value value = new Value();
        System.out.println("Enter n");
        n = value.size();
        System.out.println("Enter m");
        m = value.size();
        System.out.println("Enter k");
        k = value.size();
        if (k >= n){
            System.out.println("k can not < n");
            k = value.size();
        }

        System.out.format("Size arrays %d and %d \n", n, m);
        int[] a = new int[n];
        int[] b = new int[m];

        a = (new ArrayFilling()).array(n);
        a = Arrays.copyOf(a, (n + m));
        b = (new ArrayFilling()).array(m);


        for (int i = (n + m - 1); i > (k + m -1); i--){
            a[i] = a[i - m];
        }

        for (int i = k; i < k + m; i++){
            a[i] = b[i - k];
        }

        System.out.println("\n");
        for(int i = 0; i < (n + m); i++){
            System.out.print("\t" + a[i]);
        }
    }
}
