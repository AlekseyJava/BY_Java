package decision;

public class Decision {
    public static void main(String[] args) {
        EnterNumber number = new EnterNumber();
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через\n" +
                "отверстие.");
        double A = number.enterNumber();
        double B = number.enterNumber();
        double x = number.enterNumber();
        double y = number.enterNumber();
        double z = number.enterNumber();
        boolean result;

        Hole hole = new Hole();
        result = hole.throughTheHole(A, B, x, y, z);
        if (result == true){
            System.out.println("Пройдет");
        }
        else {
            System.out.println("Не пройдет");
        }

    }

}
