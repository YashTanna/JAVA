import java.util.Scanner;

public class firstString {
    public static void main(String[] args) {
        String name = new String("My name is Yash");
        System.out.println(name);
        try (Scanner scr = new Scanner(System.in)) {
            String name2 = scr.next();
            System.out.println(name2);
            String name1 = scr.nextLine();
            System.out.println(name1);
        }
    }
}
