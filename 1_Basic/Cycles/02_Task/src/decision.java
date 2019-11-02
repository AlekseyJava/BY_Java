import enterNumber.EnterNumber;

public class decision {
    public static void main(String[] args) {
        System.out.println("Вычисление значение функции на отрезке [a,b] с шагом h");
        EnterNumber number = new EnterNumber();
        double a = number.enterNumber();
        double b = number.enterNumber();
        double h = number.enterNumber();

        double x = a;
        double y = 0;

        while (x<=b){

            if (x > 2){
                y = x;
            }
            if (x <= 2){
                y = 0-x;
            }
            System.out.println(y);
            x = x + h;
        }
    }
}
