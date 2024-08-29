class Yash{
    String name;
    int age;
    String collageName;
    int semNo;

    Yash(String name,int age,String collageName,int semNo){
        this.name = name;
        this.age = age;
        this.collageName = collageName;
        this.semNo = semNo;
    }

    @Override
    public String toString(){
        return "Name : "+name+"\nAge : "+age+"\nCollageName : "+collageName+"\nSem :"+semNo;
    }
}

public class Test{
    public static void main(String[] args) {
        System.out.println(new Yash("Yash",19,"DDU",5));
    }
}
