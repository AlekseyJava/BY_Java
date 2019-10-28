package Decision;

public class Formula {
    private double x;
    private double y;
    public void formula(double x, double y){
        System.out.println((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))*Math.atan(x*y));

    }
}
