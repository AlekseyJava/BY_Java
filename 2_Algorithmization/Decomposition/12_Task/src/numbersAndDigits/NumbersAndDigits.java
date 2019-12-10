package numbersAndDigits;

public class NumbersAndDigits {
    public static void main(String[] args) {
        int K = 1234507654;
        int k1 = K;
        int N = 100;
        int n = 5;
        int count = 0;
        int[] A = new int[n];
        int sum = 0;
        int randomKolvaCifr = 0;

//количество цифр
        while (k1 > 0) {
            //a[count] =
            k1 = k1 / 10;
            count = count + 1;
        }

        int[] a = new int[count];
//массив цифр
        for (int i = 0; i < count; i++) {
            a[i] = K % 10;
            System.out.print(a[i] + "\t");
            K = K / 10;
        }
        System.out.println();

        // метод рандом
        for(int i = 0; i < n ; i++){
            randomKolvaCifr = (int)(Math.random()*count);
            System.out.println(randomKolvaCifr);

            for(int j = 0; j < randomKolvaCifr; j++) {
                sum = sum + a[(int) (Math.random() * count)];
                sum = 0;
            }
            A[i] = sum;

        }

    }
}
