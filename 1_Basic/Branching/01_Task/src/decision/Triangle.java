package decision;

public class Triangle {
    public void triangle(double angle1, double angle2){
        if (((angle1 + angle2) < 180)&&(angle1 > 0) && (angle2 > 0)){
            System.out.println("Triangle exist!");
            if ((angle1 + angle2)==90) {
                System.out.println("Triangle rectangular");
            }
            else {
                System.out.println("Triangle not rectangular");
            }
        }
        else {
            System.out.println("Triangle not exist!");
        }
    }
}
