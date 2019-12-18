package removeExtraSpaces;

public class RemoveSpaces {
    //private char[] outputString = new char[];
    public char[] output(char[] inputString){
        char[] outputString = new char[inputString.length];
        for(int i = 0; i < inputString.length; i++){
            if((inputString[i] == ' ')&&(inputString[i+1] == ' ')){

            }
            else{
                outputString[i] = inputString[i];
            }

        }
        return outputString;
    }
}
