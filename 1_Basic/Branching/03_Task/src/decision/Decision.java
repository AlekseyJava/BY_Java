package decision;

public class Decision {
    public static void main(String[] args) {
        EnterNumber number = new EnterNumber();
        System.out.println("Задаются три точки А(x1,y1),B(x2,y2),C(x3,y3)");
        System.out.println("Определить находятся ли они на одной прямой");
        double x1 = number.enterNumber();
        double y1 = number.enterNumber();
        double x2 = number.enterNumber();
        double y2 = number.enterNumber();
        double x3 = number.enterNumber();
        double y3 = number.enterNumber();
        boolean result = false;
        Straight straight = new Straight();
        result = straight.straight(x1,y1,x2,y2,x3,y3);
        if (result == true){
            System.out.println("Точки находятся на одной прямой");
        }
        else {
            System.out.println("Точки не находятся на одной прямой");
        }
    }

}
