package numbersTwins;

import java.io.*;

public class Variable {
    private int value = 0;
    public int value(){
        System.out.println("Введите натуральное число (n)");
        InputStream reader = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            value = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Не корректно введено число");
            e.printStackTrace();
        }
        if (value <=2){
            System.out.println("Число, которое введено, не больше 2-х");
        }
        return value;
    }
}
