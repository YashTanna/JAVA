
@SuppressWarnings("unchecked")
class MyArray<T>{
    T[] a = (T[]) new Object[10];
    int len = 0;

    public void append(T v){
        a[len++] = v;
    }

    public void display(){
        for(int i=0;i<len;i++)
            System.out.println(a[i]);
    }

}


public class GenericDemo {
    public static void main(String[] args) {
        MyArray ma = new MyArray<>();
        ma.append("TANNA");
        ma.append("YASH");
        ma.append(10);

        ma.display();
    }
}
