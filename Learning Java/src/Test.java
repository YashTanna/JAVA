import java.awt.*;

class MyFrame2 extends Frame{
    TextField tf;
    Button b;
    Label l;

    MyFrame2(){
        super("My App");


        setLayout(new FlowLayout());
        
        tf = new TextField(20);
        b = new Button("Ok");
        l = new Label("Name");
        
        add(l);
        add(tf);
        add(b);
    }
}

public class Test {
    public static void main(String[] args) {
        MyFrame2 mf = new MyFrame2();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
}
