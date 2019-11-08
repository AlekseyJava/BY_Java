package decision;

public class Decision {
    public static void main(String[] args) {
        double[] myArray;

        OneDimenArray array = new OneDimenArray();
        myArray = array.arrayDouble();
        int negativ = 0;
        int zero = 0;
        int positiv = 0;

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] < 0) negativ++;
            if (myArray[i] == 0) zero++;
            if (myArray[i] > 0) positiv++;
        }
        System.out.println("Количество элементов массива меньше 0: - " +  negativ);
        System.out.println("Количество элементов массива равно 0: - " +  zero);
        System.out.println("Количество элементов массива больше 0: - " +  positiv);
    }
}
