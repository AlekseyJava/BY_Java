package area;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой
public class Area {
    public static void main(String[] args) {
        Variable variable = new Variable();
        System.out.println("Введите стороны трапеции");
        double X = variable.value();
        double Y = variable.value();
        double Z = variable.value();
        double T = variable.value();

        TrapezoidArea trapezoidArea = new TrapezoidArea();
        System.out.println(trapezoidArea.area(X, Y, Z, T));


    }
}
