package decision;

public class Hole {
    public boolean throughTheHole(double A, double B, double x, double y, double z){
        boolean willPass = false;
        if (A >= x) {
            if ((B >= y)||(B >= z)){
                willPass = true;
                return willPass;
            }
        }

        if (A >= y) {
            if ((B >= x)||(B >= z)){
                willPass = true;
                return willPass;
            }
        }

        if (A >= z) {
            if ((B >= x)||(B >= y)){
                willPass = true;
                return willPass;
            }
        }

        else {
            willPass = false;
        }

        return willPass;
    }
}
