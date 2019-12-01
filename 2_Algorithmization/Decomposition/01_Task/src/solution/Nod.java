package solution;

public class Nod {
    private int max = 0;
    private int nod = 1;

    public int findNOD(int a, int b){
        max = Math.min(a,b);
        for (int i = 1; i <= max; i++){
            if ((a%i == 0)&&(b%i == 0)){
                nod = i;
            }
        }
        return nod;
    }
}
