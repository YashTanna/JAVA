interface camera
{
    default void Recording()
    {
        System.out.println("Recording in 4K...");
    }
    default void greet()
    {
        System.out.println("Good Evening...");
    }
}

class Myphone implements camera
{
    void greeet()
    {
        greet();
    }

}
public class DefultMethod {
    public static void main(String[] args) {
        camera c1 = new Myphone();
        c1.Recording();

    }
}
