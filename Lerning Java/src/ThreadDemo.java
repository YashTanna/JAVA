class Hi extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println(i);
            //try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println(i);
            //try {Thread.sleep(500);} catch(Exception e){}
        }
    }

}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi h = new Hi();
        Hello he = new Hello();

        he.start();
        h.start();

    }
}
