package arraySort;

import java.util.Scanner;

public class Variable {

    private int n = 0;
    Scanner scaner = new Scanner(System.in);
    public int value(){
        System.out.println("Enter variable value");
        try{
            n = Integer.parseInt(scaner.next());
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error! (Введено не целое положительное число)");
        }
        return n;
    }

}
