package armstrong;

public class NumbersArmstrong {
    private int count;
    private int[] arrayDigits = new int[10];
    private int sum = 0;
    public void numbers(int k){
        System.out.println("Числа Армстронга(допилить)");
        for (int i = 1; i < k; i++){
            count = new CountDigits().count(i);
            arrayDigits = new CountDigits().arrayDigits(arrayDigits,count, i);
            for(int j = 0; j < count; j++){
                sum = sum + (int)(Math.pow(arrayDigits[j], count));
            }
            if (i == sum){
                System.out.println("Найдено число Армстронга:  " + i);
            }
            sum = 0;
        }

    }
}
