package ArrayInsert;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Value value = new Value();
        n = value.size();
        m = value.size();

        int[] a = new IncreasingSequence().sequence(n);
        int[] b = new IncreasingSequence().sequence(m);

        ArrayOutput array = new ArrayOutput();
        array.output(a);
        array.output(b);

        a = (new ArrayInsert()).merger(a,n,b,m);
        Arrays.sort(a);
        array.output(a);


    }

    public int[] merger(int[] a, int n, int[] b, int m){
        if (n >= m){
            a = Arrays.copyOf(a, n+m);
            for(int i = n; i < n + m; i++){
                a[i] = b[i - n];
            }
            //Arrays.sort(a);
            return  a;
        }
        else{
            b = Arrays.copyOf(b, n+m);
            for(int i = m; i < n + m; i++){
                b[i] = a[i - m];
            }
            return b;
        }

        //return a;
    }
}
