package maximum2;

public class MaximumTwo {
    public static void main(String[] args) {
        int n = 0;
        int myMaximum = 0;
        n = new Variable().value();
        int[] array = new int[n];
        array = new ArrayFilling().filling(array);
        myMaximum = new MyMaximum().maximumTwo(array);
        //System.out.println();
        System.out.println("\n2-ое максимальное число = "  + myMaximum);

    }
}
