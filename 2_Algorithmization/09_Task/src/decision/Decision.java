package decision;

public class Decision {
    public static void main(String[] args) {
        ArrayFilling arrayFilling = new ArrayFilling();
        int[] a = arrayFilling.arrayFilling();
        //int[] b = arrayFilling.arrayFilling();
        int n = a.length;
        int[] k = new int[n];
        int max = 0;
        int index = 0;

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (a[i]==a[j]){
                    k[i] = k[i] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++){
            if(max < k[i]){
                index = i; max = k[i];
            }
            if (max == k[i]){
                if(a[i] < a[index]){
                    index = i;
                }
            }
        }

        System.out.println("Максимальное количество встречаемого числа - " + (k[index]));
        System.out.println("Это число: " + a[index]);
    }

}
