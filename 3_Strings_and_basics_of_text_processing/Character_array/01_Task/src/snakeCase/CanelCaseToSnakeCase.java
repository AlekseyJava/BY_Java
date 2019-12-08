package snakeCase;

public class CanelCaseToSnakeCase {
    private String s = "";
    public String toSnakeCase(char[] c){
        s = "";
        for(int i = 0; i < c.length; i++){
            if ((Character.isUpperCase(c[i]))==true){
                s = s + '_' + Character.toLowerCase(c[i]);
            }
            else s = s + c[i];
        }
        return s;
    }
}
