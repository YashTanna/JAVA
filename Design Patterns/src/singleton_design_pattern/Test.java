package singleton_design_pattern;

public class Test {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("Error in l1");
        l2.log("Error in l2");
    }
}
