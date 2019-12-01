package solution;

public class Nok {
    private int nok = 1;
    public int findNOK(int a, int b, int nod){
        nok = (a*b)/nod;
        return nok;
    }
}
