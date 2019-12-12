package increasingSequence;

//Поиск чисел, в которых цифры расположены в возрастающей последовательности
public class FindNumbers {
    private int[] array;
    public void find(int n){
        array = new int[n];
        for (int i = (int)Math.pow(10, n-1); i < (int)Math.pow(10,n); i++){
                array = new ArrayDigitsNumber().arrayDigits(array, n, i);
                if (ascendingCheak(array)) {
                    System.out.println("Число найдено: " + i);
                }
        }
    }

    public boolean ascendingCheak(int[] array){
        boolean b = true;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] <= array[i+1]){
                b = false;
            }
        }
        return b;
    }
}