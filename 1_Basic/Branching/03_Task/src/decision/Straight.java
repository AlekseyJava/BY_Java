package decision;

public class Straight {
    public boolean straight(double x1, double y1, double x2, double y2, double x3, double y3){
        if (x2 == x1){
            if (x3 == x1){
                return true;
            }
            else{
                return false;
            }
        }
        if (y2 == y1){
            if (y3 == y1){
                return true;
            }
            else{
                return false;
            }
        }
        else if (y3 == (y2-y1)/(x2-x1)*x3 ){
            return true;
        }
        else{
            return false;
        }
    }
}
