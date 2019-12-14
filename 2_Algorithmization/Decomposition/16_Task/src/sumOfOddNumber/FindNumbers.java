package sumOfOddNumber;

public class FindNumbers {
    public void numbers(int n){
        boolean b = true;
        int array[] = new int[n];
        ArrayDigitsNumber arrayDigitsNumber = new ArrayDigitsNumber();
        for (int i = (int)Math.pow(10,n-1); i < (int)Math.pow(10,n); i++){
            array = arrayDigitsNumber.arrayDigits(n, i);
            for(int j = 0; j<n; j++){
                if(array[j]%2==0){
                    b = false;
                }
            }
            if (b == true) {
                System.out.println("Найдено число состоящее из нечетных цифр: " + i);
                //b = false;
            }
            b = true;

        }
    }
}
