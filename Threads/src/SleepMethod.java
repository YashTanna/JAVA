import java.sql.SQLException;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println(i++);

        }
    }
}

public class SleepMethod {

    public static void main(String[] args) throws Exception{

        Thread t =new MyThread("YASH");
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        mainThread.join();

    }

}
