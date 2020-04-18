public class Main {
    public static void main(String[] args) {
       Test1 test = new Test1();
        test.setA(10);
        test.setB(17);
        test.print();
        System.out.println("Sum: " + test.sum());
        System.out.println("Maximum: " + test.maximum());
    }
}
