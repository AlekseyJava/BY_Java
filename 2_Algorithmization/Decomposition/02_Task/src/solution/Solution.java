package solution;

public class Solution {
    public static void main(String[] args) {
        int a = new Variable().value();
        int b = new Variable().value();
        int c = new Variable().value();
        int d = new Variable().value();
        int nod = 1;

        nod = new Nod().findNOD(a,b,c,d);

        System.out.println("Nod чисел = " + nod);

    }
}
