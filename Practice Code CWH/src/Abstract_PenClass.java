abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class NoteBook extends Pen
{
    void write()
    {
        System.out.println("Pen..");
    }
    void refill()
    {
        System.out.println("Refilling...");
    }
}

public class Abstract_PenClass {
    public static void main(String[] args) {

    }
}
