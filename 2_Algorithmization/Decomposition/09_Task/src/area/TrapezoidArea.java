package area;

public class TrapezoidArea {
    private double result = 0;
    public double area(double X, double Y, double Z, double T){
        if((X>=(Y+Z+T))||(Y>=(X+Z+T))||(Z>=(X+Y+T))||(T>=(X+Y+Z))) {
            System.out.println("Трапеция с такими сторонами не существует");
        }
        if((T*T) != ((X-Z)*(X-Z) + (Y*Y))){
            System.out.println("Трапеция без прямых углов");
        }
        else{
            result = (double)(Y*(X+Z)/2);
        }
        return result;
    }
}
