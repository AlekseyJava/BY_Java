package numbersTwins;


//Класс в котором реализован метод, находящий 2-х близнецов и выводящий их в консоль
public class Twins {

    PrimeNumber primeNumber = new PrimeNumber();


    public void twins(int n){
        for (int i = n; i <= 2*n -2; i++){
            if((primeNumber.prime(i))&&(primeNumber.prime(i+2))){
                System.out.format("Найдены близнецы %d и %d \n", i, i+2);
            }
        }
    }
}
