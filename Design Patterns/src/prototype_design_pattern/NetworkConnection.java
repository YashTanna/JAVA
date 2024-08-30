package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;

    public List<String> getDomain() {
        return domain;
    }

    private List<String> domain = new ArrayList<>();

    public String getData() {
        return data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void loadData(){
        this.data = "Very much time consuming data";
        domain.add("www.google.com");
        domain.add("www.youtube.com");
        domain.add("www.X.com");
        domain.add("www.instagram.com");
        domain.add("www.amazon.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return getIp()+" : "+getData()+" : "+getDomain();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        NetworkConnection n1 = new NetworkConnection();

        n1.setIp(this.getIp());
        n1.setData(this.getData());
        List<String> domain = this.getDomain();

        for(String s:domain){
            n1.getDomain().add(s);
        }

        return n1;
    }
}
