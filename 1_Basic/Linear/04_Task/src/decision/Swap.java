package decision;

public class Swap {
    private double a = 0;
    public double swap(double number){
        a = ((number*1000)%1000) + (double)((int)(number/1))/1000;;
        return a;
    }
}
