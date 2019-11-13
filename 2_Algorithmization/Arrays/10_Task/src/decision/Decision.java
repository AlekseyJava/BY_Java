package decision;

public class Decision {
    public static void main(String[] args) {
        ArrayFilling arrayFilling = new ArrayFilling();
        int[] array = arrayFilling.arrayFilling();

        for (int i = 0; i < array.length-1; i=i+2){
            array[i+1] = 0;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

