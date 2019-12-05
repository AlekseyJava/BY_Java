package compireNumbers;

//Программа для определения являются ли числа взаимно простыми.
public class СomprimeNumbers {
    public static void main(String[] args) {
        System.out.println("Программа определяет являются ли числа взаимно простыми");
        int a = 0;
        int b = 0;
        int c = 0;

        a = new Variable().value();
        b = new Variable().value();
        c = new Variable().value();

        ComprimeOrUncomprime comprime = new ComprimeOrUncomprime();
        if(comprime.find(a,b,c) == true){
            System.out.println("Числа являются взаимно простыми");
        }
        else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }
}
