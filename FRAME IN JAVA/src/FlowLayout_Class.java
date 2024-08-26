import java.awt.*;

public class FlowLayout_Class extends Frame {

    FlowLayout_Class()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        Button b1 = new Button("BTN1");
        Button b2 = new Button("BTN2");
        Button b3 = new Button("BTN3");
        Button b4 = new Button("BTN3");
        Button b5 = new Button("BTN3");
        Button b6 = new Button("BTN3");

        b1.setBounds(100,50,170,60);
        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);
    }

    public static void main(String[] args) {
        FlowLayout_Class f = new FlowLayout_Class();
    }
}
