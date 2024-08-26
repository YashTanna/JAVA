import java.io.*;

public class fio {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("yash.txt");

            int x = fis.read();

            System.out.println((char)x);

            fis.close();
        } catch (Exception e) {
        }
    }
}
