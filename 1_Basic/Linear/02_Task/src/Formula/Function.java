package Formula;

public class Function {
    double x = 0;
    public double func (double a, double b, double c){
        x = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - a*a*a + 1/(b*b);
        System.out.println(x);
        return x;
    }
}
