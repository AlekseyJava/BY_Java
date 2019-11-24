package arrayInsert;

public class ArrayFilling {

    public int[] array(int n){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i]=(int)(Math.random()*100);
            System.out.print("\t" + array[i]);
        }
        System.out.println();
        return array;
    }
}
