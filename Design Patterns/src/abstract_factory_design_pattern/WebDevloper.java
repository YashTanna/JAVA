package abstract_factory_design_pattern;

public class WebDevloper implements Employee{
    public int salary(){
        return 30000;
    }

    public String name(){
        System.out.println("i am Web devloper");
        return "WEB DEVLOPER";
    }
}
