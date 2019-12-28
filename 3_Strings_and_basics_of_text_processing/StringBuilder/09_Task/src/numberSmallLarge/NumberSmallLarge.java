package numberSmallLarge;
//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//Учитывать только английские
//буквы.
public class NumberSmallLarge {
    public static void main(String[] args) {
        String s = "Hello World! My name is Aleksey!";
        StringBuilder s1 = new StringBuilder("Hello! It is a StringBulilderObject!!!q");
        int countSmallLeters = 0;
        int capitallLeters = 0;

        for (int i = 0; i < s1.length(); i++){
            //if (Character.toLowerCase(s.charAt(i))){
            if (Character.isUpperCase(s1.charAt(i))){
                System.out.println("Большая буква");
                capitallLeters++;
            }
            if (Character.isLetter(s1.charAt(i))){
                System.out.println("маленькая буква");
                countSmallLeters++;
            }

        }
        System.out.println(countSmallLeters);
        System.out.println(capitallLeters);
    }
}
