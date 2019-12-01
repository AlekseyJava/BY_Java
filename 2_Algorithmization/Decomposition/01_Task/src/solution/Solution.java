package solution;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int nod = 1;
        int nok = 1;

        a = new Variable().value();
        b = new Variable().value();

        nod = new Nod().findNOD(a,b);
        System.out.println("NOD = " + nod);

        nok = new Nok().findNOK(a,b,nod);
        System.out.println("NOK = " + nok);

    }
}
