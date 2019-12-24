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
        String input = "aaa my stringa ";

        int index = input.indexOf("a");
        int count1 = 0;
        while (index != -1) {
            count1++;
            input = input.substring(index + 1);
            index = input.indexOf("a");
        }
        System.out.println("a встречается : " + count1 + " раз");
    }
}
