package comparison;

public class ComparisionNumber {
    public void comparDigits(int a, int b){
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);

        if (s1.length()>s2.length()){
            System.out.println("Количество цифр в первом числе больше количества цифр второго");
        }
        else if (s1.length()<s2.length()){
            System.out.println("Количество цифр во втором числе больше количества цифр первого");
        }
        else{
            System.out.println("Количество цифр в 2-х числах равно");
        }
    }
}
