package numbersTwins;


// Проверка является ли число простым или нет

public class PrimeNumber {
    private boolean variable = true;
    public boolean prime(int a){
        variable = true;
        for (int i = 2; i < a; i++){
            if((a%i) == 0){
                variable = false;
            }
        }

        return variable;
    }
}
