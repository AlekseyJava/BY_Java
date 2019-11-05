package decision;

public class Decision {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        EnterNaturalNumber number = new EnterNaturalNumber();
        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители , кроме 1 и числа");
        m = number.naturalNumber();
        n = number.naturalNumber();

        for (int i = m; i <=n; i++){
            System.out.print("Число: " + i + " делители: ");
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }

    }
}
