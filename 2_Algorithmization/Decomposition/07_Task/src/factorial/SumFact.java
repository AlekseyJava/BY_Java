package factorial;

public class SumFact {
    private int sum = 1;
    private int factorial = 1;
    public int sum(int n){
        for (int i = 3; i <= n; i+=2){
            factorial = factorial*(i-1)*i;
            sum = sum + factorial;
            //i = i + 2;
        }
        return sum;
    }
}
