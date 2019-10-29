package decision;

public class ParseTime {
    public void purseTime(int n){
        int h = 0;
        int m = 0;
        int s = 0;
        h = n/3600;
        m = (n - h*3600)/60;
        s = (n - h*3600 - m*60);
        System.out.println(h + "ч " + m + "м " + s + "c");
    }
}
