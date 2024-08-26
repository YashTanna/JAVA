public class MethodinJava {

    int sum (int a,int b)
    {
        return (a+b);
    }
    static void change(int [] arr)
    {
        arr[0]=1000;
    }
    static void change(int a)
    {
        a=1000;
    }
    static void telljock()
    {
        System.out.println("My name is Yash");
    }


    public static void main(String[] args) {
        int [] a = {32,35,36,37,34};
        change(a[0]);
        System.out.println(a[0]);
    }
}
