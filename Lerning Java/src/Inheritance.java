class Base
{
    public Base()
    {
        System.out.println("Constructor of Base class");
    }
    public Base(int x)
    {
        this.x=x;
        System.out.println(x);
    }
    int x;
    public int getX() {
        System.out.println("I am in Base and setting x now");
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe()
    {
        System.out.println("I am from class Base");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Constructor of Derived class");
    }
    int y;

    public Derived(int a,int y)
    {
        super(a);

        this.y = y;
        System.out.println(y);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

    Derived d1 = new Derived(5,6);
    }
}
