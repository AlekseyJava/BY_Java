package maxDistance;

public class MaxDistance {
    public static void main(String[] args) {
        int n = 0;
        double maxDiatance = 0;
        n = new Variable().value();
        Integer[][] array = new Integer[n][2];
        array = new ArrayFilling().filling(array,n);
        maxDiatance = new MaximumDistance().maximim(array, n);
        System.out.println(maxDiatance);
    }
}
