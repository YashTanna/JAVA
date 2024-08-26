//import javax.servlet.*;
//import javax.servlet.HttpServlet.*;

@FunctionalInterface
interface fname{
    void display();
}

class FullName{
    public void display(fname f){
        f.display();
    }
}


public class Name {

    public static void main(String[] args) {

        FullName fn = new FullName();

       fname f = () -> {
           System.out.println("YASH TANNA");
       };


    }

}
