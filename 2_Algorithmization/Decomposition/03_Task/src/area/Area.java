package area;

public class Area {
    public static void main(String[] args) {
        double a = 0;
        double S = 0;
        a = new Variable().value();
        S = new AreaHexagon().area(a);
        System.out.format("Area Hexagon = %.3f",S);
    }
}
