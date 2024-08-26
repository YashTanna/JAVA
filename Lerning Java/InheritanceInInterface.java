interface Sample
{
    default void method1()
    {
        System.out.println("Method1");
    }
    default void method2()
    {
        System.out.println("Method2");
    }
}

interface childSample extends Sample
{
    default void method3()
    {
        System.out.println("Method3");
    }
    default void method4()
    {
        System.out.println("Method4");
    }
}

class SampleClass implements childSample{}

public class InheritanceInInterface {
    public static void main(String[] args) {
        SampleClass s1 = new SampleClass();
        s1.method4();
    }
}
