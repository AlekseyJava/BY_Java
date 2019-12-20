package insertChar;

//В строке вставить после каждого символа 'a' символ 'b'.

public class InsertSymbol {
    public static void main(String[] args) {
        String inputString = "My string aaa, hello I from Russia, Saratov!";
        String outputString;

        Conversion conversion = new Conversion();
        outputString = conversion.convert(inputString);

        System.out.println(outputString);
    }
}
