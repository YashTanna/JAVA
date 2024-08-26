interface parent
{
    void show();
    void greet3();

}

class child2 implements parent
{

    @Override
    public void show() {
        System.out.println("Hello world");
    }

    @Override
    public void greet3() {
        System.out.println("Good morning");
    }


}

public class Interface {
    public static void main(String[] args) {
        parent p1 = new child2();
        p1.show();
        p1.greet3();
    }
}
