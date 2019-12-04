package maximum2;

public class MyMaximum {
    int max = 0;
    int max_2 = 0;
    public int maximumTwo(int[] a){
        if(a[0] < a[1]){
            max = a[1];
            max_2 = a[0];
        }
        else{
            max = a[0];
            max_2 = a[1];
        }

        for (int i = 2; i < a.length; i++){
            if (a[i] > max_2){
                if(a[i] > max){
                    max_2 = max;
                    max = a[i];
                }
                else max_2 = a[i];
            }
        }
        return max_2;
    }
}
