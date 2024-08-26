//class MyThread extends Thread{
//    public void run(){
//        int i=1;
//        while(i < 10000){
//            System.out.println(i+"Hello");
//            i++;
//        }
//    }
//}

public class Main extends Thread{

    public void run(){
        int i=1;
        while(i < 10000){
            System.out.println(i+"Hello");
            i++;
        }
    }


    public static void main(String[] args) {

        new Main().start();
        int i=1;
        while(i < 10000){
            System.out.println(i+"World");
            i++;
        }


    }
}