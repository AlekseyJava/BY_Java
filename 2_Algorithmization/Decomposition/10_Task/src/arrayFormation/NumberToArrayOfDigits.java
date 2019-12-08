package arrayFormation;

public class NumberToArrayOfDigits {
    //private int[] array;
    public int[] digits(int n){
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            digits[i] = Character.digit(s.charAt(i), 10);
        }
        return digits;
    }
}
