import java.io.*;
class RandomAccess
{
  public static void main(String[] args) throws IOException
   {
	   RandomAccessFile raf = new RandomAccessFile("yash.txt","rw");
	   raf.seek(9);
	   raf.writeChar('y');
	   raf.skipBytes(9);
	   raf.writeChar('Y');
   }
}   