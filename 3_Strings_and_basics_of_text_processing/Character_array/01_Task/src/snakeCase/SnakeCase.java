package snakeCase;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class SnakeCase {
    public static void main(String[] args) {

        String[] arrayString = {"canelCase", "canelCaseTwo", "canelCaseThree", "canelCaseFour"};
        char[] c;
        String s = "";

        //класс для перевода из canelCase в snale_case
        CanelCaseToSnakeCase canelCaseToSnakeCase = new CanelCaseToSnakeCase();

        for(int i = 0; i < arrayString.length; i++){
            c = arrayString[i].toCharArray();  //переводим строку в массив символов
            s = canelCaseToSnakeCase.toSnakeCase(c); //метод берет массив символов и из canelCase переводит в snake_case
            System.out.println(s);
        }
    }
}
