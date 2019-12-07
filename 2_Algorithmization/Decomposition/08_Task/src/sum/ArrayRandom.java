package sum;

public class ArrayRandom {
    public int[] arrayFilling(int[] array){
        System.out.println("Заполняем массив");
        for (int i =0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
            System.out.print(array[i] + "\t");
        }
        return array;
    }
}
