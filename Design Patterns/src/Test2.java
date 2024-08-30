class Logger{

    public static Logger myInstance;
    private Logger(){}



    public static Logger getInstance(){
        if(myInstance == null){
            myInstance = new Logger();
        }

        return myInstance;
    }

    public void log(String s){
        System.err.println(s);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Logger l = Logger.getInstance();
        System.out.println(l.hashCode());
        Logger l2 = Logger.getInstance();
        System.out.println(l2.hashCode());
    }
}
