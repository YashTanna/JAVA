public class ThreadUsingRunnable implements Runnable{
    public void run(){

            int i=1;
            while(i < 10000){
                System.out.println(i+"Hello");
                i++;

        }
    }

    public static void main(String[] args) {
        ThreadUsingRunnable tu = new ThreadUsingRunnable();
        Thread t = new Thread(tu);
        t.start();


            int i=1;
            while(i < 10000){
                System.out.println(i+"World");
                i++;

        }
    }
}
