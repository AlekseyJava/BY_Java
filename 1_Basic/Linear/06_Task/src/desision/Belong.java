package desision;

public class Belong {
    public boolean belong(double x, double y){
        //1-ая четверть
        if ((x >= 0)&&(y >= 0)) {
            if ((x <= 2)&&(y <= 4)) return true;
            else return false;
        }

        //2-ая четверть
        if ((x <= 0)&&(y >= 0)){
            if ((x >= -2)&&(y <=4)) return true;
            else return false;
        }

        //2-ая четверть
        if ((x <= 0)&&(y <= 0)){
            if ((x >= -4)&&(y >= -3)) return true;
            else return false;
        }

        //2-ая четверть
        if ((x >= 0)&&(y <= 0)){
            if ((x <= 4)&&(y <= -3)) return true;
            else return false;
        }


        else return false;
    }
}
