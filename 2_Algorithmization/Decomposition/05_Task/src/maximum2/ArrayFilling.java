package maximum2;

public class ArrayFilling {
    public int[] filling(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.printf("%d\t",array[i]);
        }
        return array;
    }
}
