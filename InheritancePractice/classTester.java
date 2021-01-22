public class classTester{
    public static void main(String[] args) {
        Class_2 test = new Class_2();
        Class_2 test1 = new Class_2(5, 7, 2);

        test.print();

        test1.print();

        test.set(3, 5, 4);

        test.print();

        System.out.println(test);
    }
}