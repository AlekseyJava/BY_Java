package count;
// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class CountA {
    public static void main(String[] args) {
        String s = "aaa my stringa ";
        int count = 0;

        //my method
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.format("Буква %s встречается в строке - %d раз", "a", count);


        //не мой метод
        System.out.println("\n");
        String input = "kljsdhfdskhjis iiisisis";

        int index = input.indexOf("is");
        int count1 = 0;
        while (index != -1) {
            count1++;
            input = input.substring(index + 1);
            index = input.indexOf("is");
        }
        System.out.println("No of *is* in the input is : " + count1);
    }
}
