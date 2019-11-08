import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneDimenArray {

    int n = 0; //размер  массива
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

    public int[] arrayInt(){

        System.out.println("Введите размер массива");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введен размер массива(Должно быть целое положжительное число)");
            System.out.println("Попробуйте еще  раз");
            arrayInt();
            e.printStackTrace();
        }

        int array[] =  new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*100 + 1);
        }
        System.out.println("Массив заполнен числами от 1 до 100");
        return array;
    }
}
