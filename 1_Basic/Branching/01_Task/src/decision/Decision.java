package decision;

public class Decision {
    public static void main(String[] args) {
        double angle1 = 0;
        double angle2 = 0;
        EnterNumber number = new EnterNumber();

        angle1 = number.enterNumber();
        angle2 = number.enterNumber();

        Triangle triangle = new Triangle();
        triangle.triangle(angle1,angle2);
    }
}
