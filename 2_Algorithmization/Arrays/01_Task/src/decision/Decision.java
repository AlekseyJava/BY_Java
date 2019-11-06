package decision;

public class Decision {
    public static void main(String[] args) {
        int k = 2;
        int[] mas = {1,2,4,-5,-3,0,1,8,1,5,1,-5,19,1,7};
        int sum = 0;
        System.out.println("Находим сумму элементов массива кратных k");
        for (int i = 0; i<mas.length; i++){
            if (mas[i]%k==0){
                sum = sum + mas[i];
            }
        }
        System.out.println("Сумма элементов массива равна: " +  sum);
    }
}
