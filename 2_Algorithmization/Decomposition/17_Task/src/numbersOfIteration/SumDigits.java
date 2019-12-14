package numbersOfIteration;

public class SumDigits {
    public int sum(int n){
        int count = 0;
        int sum = 0;

        CountDigitsAndArrayDigits countDigitsAndArrayDigits = new CountDigitsAndArrayDigits();
        count = countDigitsAndArrayDigits.count(n);
        int[] arrayDigits = new int[count];
        arrayDigits = countDigitsAndArrayDigits.arrayDigits(n, count);

        for(int i = 0; i < count; i++){
            sum = sum + arrayDigits[i];
        }
        return sum;
    }
}
