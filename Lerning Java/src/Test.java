//////import java.util.*;
//////
////////class Ekclass
////////{
////////    int a;
////////    int b;
////////    int  getA()
////////    {
////////        return a;
////////    }
////////
////////}
//////
////////public class Test {
////////    public static void main(String[] args) {
////////        System.out.println();
////////        Random ren = new Random();
////////        for(int i=0;i<3;i++) {
////////            int a = ren.nextInt(3);
////////            System.out.println(a);
////////        }
////////    }
////////}
//////
//////class test
//////{
//////    static void staticBlock()
//////    {
//////        static
//////        {
//////            System.out.println("Static block");
//////        }
//////    }
//////
//////
//////    public static void main(String[] args) {
//////        System.out.println("Main method");
//////        staticBlock();
//////        staticBlock();
//////    }
//////}
////
////class Box
////{
////    static
////    {
////        System.out.println("Static block");
////    }
////    Box()
////    {
////        System.out.println("Box()");
////    }
////
////}
////
////class test
////{
////    public static void main(String[] args) {
////        System.out.println("Main Block");
////        Box b = new Box();
////        Box b2 = new Box();
////    }
////}
////
//class test
//{
//    public static void main(String[] args) {
//
//
//        char ch[] = {'H', 'e', 'l', 'l', 'o' };
////        String str = new String(ch, 2, 2);
////        System.out.println(str);
//        String str = String.copyValueOf(ch);
////        System.out.println(str);
////        String str1 = "Hello";
//        byte by[] = str.getBytes();
//        for(byte temp : by)
//        {
//            System.out.println(temp);
//        }
////        boolean b = str.equals(str1);
////        System.out.println(b);
////        String str2 = "Java";
////        String str3 = str1.concat(str2);
////        System.out.println(str3);
//
//    }
//}

class test
{
    public static void main(String[] args) {
//        int x = 250;
//        String s = String.valueOf(x);
//        System.out.println(s);
        String str = "Hello,world,java";
        String s1[] = new String[5];
        s1 = str.split(",");
                for(String temp : s1)
                {
                    System.out.println(temp);
                }
    }
}