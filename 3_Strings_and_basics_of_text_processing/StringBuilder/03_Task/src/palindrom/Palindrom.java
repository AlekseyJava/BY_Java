package palindrom;

//Метод для проверки является ли слово полиндромом
public class Palindrom {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("dad");
        StringBuilder s1 = new StringBuilder();
        s1 = s1.append(s);
        s.reverse();
        //s.reverse();

        if (s.toString().equals(s1.toString())) {
            System.out.println("Polindrom");
        }
        else {
            System.out.println("Not polindrom");
        }
        System.out.println(s);
        System.out.println(s1);

    }
}
