class STest{
    static int x = 1;
    public void main2()
    {
        x++;
        System.out.println(x);

    }


}

public class Test {
    public static void main(String[] args) {
        System.out.println("Main: Box");
        STest sTest = new STest();
        sTest.main2();
        sTest.main2();

    }
}
