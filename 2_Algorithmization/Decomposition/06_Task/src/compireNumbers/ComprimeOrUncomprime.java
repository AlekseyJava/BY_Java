package compireNumbers;

public class ComprimeOrUncomprime {
    private int max;
    private boolean bool = true;
    public boolean find(int a, int b, int c){
        if((a >= b)&&(a >= c)){
            max = a;
        }
        if((b >= a)&&(b >= c)){
            max = b;
        }
        if((c >= a)&&(c >= b)){
            max = c;
        }

        System.out.println(max);
        for (int i = 2; i <= max; i++){
            if (((a%i==0)&&(b%i==0))||((a%i==0)&&(c%i==0))||((b%i==0)&&(c%i==0))){
                bool = false;
            }
        }
        return bool;
    }
}
