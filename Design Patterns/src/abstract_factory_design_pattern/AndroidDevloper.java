package abstract_factory_design_pattern;

public class AndroidDevloper implements Employee{
    
    public int salary(){
        return 20000;
    }

    public String name(){
        System.out.println("i am android devloper");
        return "ANDROID DEVLOPER";
    }

}
