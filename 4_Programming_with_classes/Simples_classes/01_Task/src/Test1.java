public class Test1 {
    private int a=1;
    private int b=1;

    public void print(){
        System.out.printf("Variable1- %d, Variable2 - %d\n",this.a,b);
        //System.out.println();
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int sum(){
        return this.a + this.b;
    }

    public int maximum(){
        if (a >= b) return a;
        else return b;
    }
}
