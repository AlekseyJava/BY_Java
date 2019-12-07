package sum;

public class Sum {
    private int mySum = 0;
    public void sum(int k, int m, int[] D){
        for (int i = k-1; i < m-2; i++){
            mySum = D[i] + D[i+1] + D[i+2];
            System.out.format("\nСумма от %d-го элемента до %d-го элемента = %d",i, (i+2), mySum);
            mySum = 0;
        }
    }
}
