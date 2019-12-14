package numbersOfIteration;

public class CountDigitsAndArrayDigits {
    int count  = 1;

    public int count(int number){
        for (int i = 0; i < number; i++){
            if(number/10 > 0){
                count ++;
            }
            number = number/10;
        }
        return count;

    }

    public int[] arrayDigits(int number, int numberOfDigitsInNumber){
        int array[] = new int[numberOfDigitsInNumber];
        for (int i = 0; i < numberOfDigitsInNumber; i++){
            array[numberOfDigitsInNumber - 1 - i]=number%10;
            number = number/10;
        }
        return array;
    }
}
