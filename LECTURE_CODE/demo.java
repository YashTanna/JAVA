import java.io.*;

class demo{
    public static void main(String []args)throws FileNotFoundException,IOException
    {
        FileInputStream fis = new FileInputStream("3I.txt");

        byte []a = new byte[5];

        fis.read(a);

        for(int i=0;i<5;i++)
        {
            System.out.println((char)a[i]);
        }

        int size = fis.available();
        
        fis.skip(size-5);

        fis.read(a);

        for(int i=0;i<5;i++)
        {
            System.out.println((char)a[i]);
        }

    }
}
    