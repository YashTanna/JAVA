public class AnyClass {
    public static void main(String[] args) {
       int a[] = new int[5];

       a[0] = 0;
       a[1] = 1;
       a[2] = 2;
       a[3] = 3;
       a[4] = 4;

       try {
           System.out.println(a[5]);
       }
       catch (Exception e)
       {
          System.out.println(e);
        //    e.printStackTrace();
       }
        System.out.println("HEllo");

    }
}
