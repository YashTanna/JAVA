package prototype_design_pattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Creating Object");
        NetworkConnection n1 = new NetworkConnection();
        n1.setIp("192.168.1.10");
        n1.loadData();
        System.out.println(n1);

        NetworkConnection n2 = (NetworkConnection) n1.clone();

        n1.getDomain().remove(1);

        System.out.println(n1);


        System.out.println(n2);

    }
}
