public class Test2 {

    int id;
    String inputString;
    public static void main(String[] args) {

    }
    public Test2(String inputString){
        this.inputString = inputString;
    }

    public Test2(int id, String inputString){
        this.inputString = inputString;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInputString(){
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}
