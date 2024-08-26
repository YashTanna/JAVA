import java.awt.*;
import java.awt.event.*;


class intrest extends Frame{
    intrest()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(5,2));
        Label l1 = new Label("Principle");
        add(l1);
        TextField t1 = new TextField();
        add(t1);
        Label l2 = new Label("Rate%");
        add(l2);
        TextField t2 = new TextField();
        add(t2);
        Label l3 = new Label("Time");
        add(l3);
        TextField t3 = new TextField();
        add(t3);
        Button b1 = new Button("Calculate Interest");
        add(b1);
        Button b2 = new Button("Stop");
        add(b2);
        Label l5 = new Label("SimpleInterest");
        add(l5);
        TextField t5 = new TextField();
        add(t5);

    }
}

public class temp {
    public static void main(String[] args) {
       new intrest(); 
    }    
}
